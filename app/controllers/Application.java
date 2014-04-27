package controllers;

import java.io.StringReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import models.ResponseBean;
import models.dto.BusStoryDTO;
import models.loader.DataLoader;
import models.places.Landmark;
import models.places.Places;
import models.uk.org.siri.siri.Siri;
import models.uk.org.siri.siri.VehicleActivityStructure;
import play.libs.F.Function;
import play.libs.F.Promise;
import play.libs.WS;
import play.mvc.Controller;
import play.mvc.Result;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import views.html.stories.list;

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
                        	if(Places.landmarks.size()==0)DataLoader.loadData();
                        	
                        	List<VehicleActivityStructure> buses = siri.getServiceDelivery().getVehicleMonitoringDelivery().get(0).getVehicleActivity();
                        	BusStoryDTO[] resArr = new BusStoryDTO[buses.size()];
                        	int i = 0;
                        	for (VehicleActivityStructure vas : buses) {
                        		BigDecimal busLat = vas.getMonitoredVehicleJourney().getVehicleLocation().getLatitude();
                        		BigDecimal busLon = vas.getMonitoredVehicleJourney().getVehicleLocation().getLongitude();
                        		List<Landmark> places = Places.getNearby(busLat.doubleValue(), busLon.doubleValue(), R);
                        		
                        		if(places.size() > 0) {
                        			                        			
                        			BusStoryDTO bsd = new BusStoryDTO(vas.getMonitoredVehicleJourney().getVehicleRef().getValue(), places.get(0).toString(), vas.getMonitoredVehicleJourney().getVehicleLocation().getLatitude().toString(),vas.getMonitoredVehicleJourney().getVehicleLocation().getLongitude().toString(),places.get(0).latitude.toString(),places.get(0).longitude.toString());
                        			resArr[i] = bsd;
                        			busStories.add(bsd);
                        		}
                        		else {
                        			String sadStory = "I wish something had happened around here to tell you about it";
                        			resArr[i] = (new BusStoryDTO("NA",sadStory,"NA","NA","NA","NA"));
                        			busStories.add(new BusStoryDTO("NA",sadStory,"NA","NA","NA","NA"));
                        		}
                        		i++;
							}
                        	//busStories.add(resArr[0]);
                        	Gson gson = new Gson();                        	
                        	String jsonPlace = gson.toJson(resArr);
                        	return redirect(routes.Application.list());
                        	//return ok(jsonPlace);
                        }
                        else return ok("gson error");
                    }
                }
        );
        
        return resultPromise;
    }
	
	
}
