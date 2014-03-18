package controllers;

import models.ResponseBean;
import play.*;
import play.mvc.*;
import views.html.*;
import play.libs.WS.*;
import play.libs.Json;
import play.libs.WS;
import play.mvc.Result;
import static play.libs.F.Function;
import static play.libs.F.Promise;
import com.google.gson.Gson;

public class Application extends Controller {
	public static final String OBA_API_ROOT = "http://bustime.mta.info/api/where/";
	public static final String OBA_API_Q = "routes-for-agency/MTA%20NYCT.json";
	public static final String OBA_API_QSTOPS = "stops-for-route/MTA%20NYCT_M5.json";
	public static final String OBA_API_QSTOP = "stop/MTA_400069.json";
	public static final String OBA_API_K = "key";
	public static final String OBA_API_KV = "3b83b547-8439-42f5-a134-6ca62e5c91dc";
	public static final String feedUrl = "http://bustime.mta.info/api/where/stops-for-route/MTA%20NYCT_M5.json";
    
	
    
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
	
	
}
