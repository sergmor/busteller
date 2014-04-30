package controllers;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import models.ResponseBean;
import models.buses.BusPlanner;
import models.documents.DocumentEvaluator;
import models.documents.DocumentPlanner;
import models.documents.SolutionEvaluation;
import models.dto.BusStoryDTO;
import models.uk.org.siri.siri.Siri;
import models.uk.org.siri.siri.VehicleActivityStructure;
import play.libs.F.Function;
import play.libs.F.Promise;
import play.libs.WS;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.stories.list;
import views.html.stories.details;

import com.google.gson.Gson;

public class Application extends Controller {
	public static final String OBA_API_ROOT = "http://bustime.mta.info/api/where/";
	public static final String OBA_API_Q = "routes-for-agency/MTA%20NYCT.json";
	public static final String OBA_API_QSTOPS = "stops-for-route/MTA%20NYCT_M5.json";
	public static final String OBA_API_QSTOP = "stop/MTA_400069.json";
	public static final String OBA_API_K = "key";
	public static final String OBA_API_KV = "3b83b547-8439-42f5-a134-6ca62e5c91dc";
	public static final String feedUrl = "http://bustime.mta.info/api/where/stops-for-route/MTA%20NYCT_M5.json";
	public static final String feedUrlSiri = "http://bustime.mta.info/api/siri/vehicle-monitoring.xml";
	public static final String op =  "OperatorRef";
	public static final String opVal = "MTA";
	public static final String line = "LineRef";
	public static final String lineV = "MTA NYCT_M5";
	public static final Double R = 1d; 
	public static Siri siri = null;
	public static List<BusStoryDTO> busStories= new ArrayList<BusStoryDTO>();
    
	
	public static Result list()
	{
		return ok(list.render(busStories));
	}
	
	public static Result details(String busId)
	{
		for(BusStoryDTO bus: busStories)
		{
			if (bus.busId.equalsIgnoreCase(busId))
				return ok(details.render(bus));
		}
		return ok(details.render(null));
	}
	
	public static Result stories(String busId) {
		//busId = new String("MTA " + busId);
		List<SolutionEvaluation> sols = DocumentEvaluator.INSTANCE.getEvaluations(busId);
		if(sols != null) {
			for(SolutionEvaluation se : sols) {
				se.evaluateSolution();
				System.out.println(se.toString());
			}
		}
		//TODO return the appropriate thing!		
		//return ok();
		
    	return ok(sols.toString());
	}
    
    public static Promise<Result> index() {
        final Promise<Result> resultPromise = WS.url(feedUrl).setQueryParameter(OBA_API_K, OBA_API_KV).get().map(
                new Function<WS.Response, Result>() {
                    public Result apply(WS.Response response) {                    	
                    	Gson gson = new Gson();
                		ResponseBean rb = gson.fromJson(response.getBody(), ResponseBean.class);
                        return ok("Feed data:" + response.asJson().findPath("data")
                        		+ "Obj Data" + rb.getData().getPolylines().get(0).getPoints()                        		
                        		);
                    }
                }
        );
        return resultPromise;
    }
    
    public static Promise<Result> siri() {
        final Promise<Result> resultPromise = WS.url(feedUrlSiri).setQueryParameter(OBA_API_K, OBA_API_KV).setQueryParameter(op, opVal)
        		.setQueryParameter(line, lineV).get().map(
                new Function<WS.Response, Result>() {
                    public Result apply(WS.Response response) {                    	
                    	JAXBContext jaxbContext;                    	
						try {
							jaxbContext = JAXBContext.newInstance(Siri.class);
							Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	                		 StringBuffer xmlStr = new StringBuffer( response.getBody() );
	                	       
	                		 siri = null;
	                		 siri = (Siri) jaxbUnmarshaller.unmarshal(new StreamSource( new StringReader( xmlStr.toString() ) ));
	                		
						} catch (JAXBException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                    	 
                		
                        if(siri!=null) {
                        	//busStories.clear();
                        	DocumentPlanner dp = new DocumentPlanner();
                        	dp.radius = R;
                        	List<VehicleActivityStructure> buses = siri.getServiceDelivery().getVehicleMonitoringDelivery().get(0).getVehicleActivity();
                        	System.out.println("APP-- Will update points");
                        	BusPlanner.INSTANCE.updateActivity(buses);
                        	Map<String,BusStoryDTO> stories = dp.pack(R);
                        	Set<String> keys = stories.keySet();
                        	for (Iterator<String> iterator = keys.iterator(); iterator.hasNext();) {
								String key = iterator.next();
								busStories.add(stories.get(key));
								//BusStoryDTO bs = stories.get(key);
								//System.out.println(bs.toString());
							}
                        	return ok(list.render(busStories));
                        	/*Gson gson = new Gson();
                        	String jsonPlace = gson.toJson(busStories.toArray());
                        	return ok(jsonPlace);*/
                        }
                        else return internalServerError("MTA API N/A");
                    }
                }
        );
        
        return resultPromise;
    }
	
	
}
