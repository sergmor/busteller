package models.places;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public enum Places {
	INSTANCE;
	private static final Double EarthRadius = 3959d;
	public static List<Landmark> landmarks = new ArrayList<Landmark>();
	public static List<Filler> fillers = new ArrayList<Filler>();
	
	public void addFiller(int id, String text) {
		fillers.add(new Filler(id, text));
	}
	
	public static void addLandmark(String name, Date designation, BigDecimal latitude,
			BigDecimal longitude, String county, String description) {
		landmarks.add(new Landmark(name,designation, latitude,
			longitude, county, description));
	}
	
	public static Landmark findByName(String name) {
		for (Landmark lm : landmarks) {			
			if(lm.name.equalsIgnoreCase(name)) {
				return lm;
			}
		}		
		return null;
	}
	
	public Filler getFiller(int i) {
		Collections.sort(fillers);
		return fillers.get(i);
		
	}
	
	public static List<Landmark> getNearby(Double lat, Double lon, Double r){
		List<Landmark> res = new ArrayList<Landmark>();
		List<Double> dist = new ArrayList<Double>();
		for (Landmark lm : landmarks) {
			dist.add(calculateDistance(lat, lon, lm.latitude.doubleValue(), lm.longitude.doubleValue()));
		}
		for(int i=0; i<dist.size(); i++) {
			if(dist.get(i) <= r) {
				res.add(landmarks.get(i));
			}
		}
		
		return res;
	}
	
	public int howManyFillers() {
		return fillers.size();
	}
	
	private static Double calculateDistance(Double lat1, Double lon1, Double lat2, Double lon2) {	    
	    Double latDistance = Math.toRadians(lat2 - lat1);
	    Double lonDistance = Math.toRadians(lon2 - lon1);
	    Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
	            + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
	            * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
	    Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	    Double distance = EarthRadius * c;
	    return distance;
	}
}
