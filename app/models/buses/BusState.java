package models.buses;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import models.uk.org.siri.siri.LocationStructure;

import org.joda.time.DateTime;
import org.joda.time.Seconds;

public class BusState {
	
	private static final Double EarthRadius = 3959d;
	private static int K = 10;
	
	public LinkedList<LocationStructure> locations;
	public LinkedList<Date> times;
	public LinkedList<Double> pointSpeed;
	public LinkedList<Double> averageSpeed = new LinkedList<Double>();
	public Double currentAvgSpeed = 0.0d;
	public String vehicleRef = "";
	public Double traveledSoFar = 0d;
	
	
	
	public BusState(String ref) {
		this.vehicleRef = ref;
		this.locations = new LinkedList<LocationStructure>();
		this.times = new LinkedList<Date>();
		this.pointSpeed = new LinkedList<Double>();
	}
	
	public Double getLat() {
		return locations.peekLast().getLatitude().doubleValue();
	}
	
	public Double getLon() {
		return locations.peekLast().getLongitude().doubleValue();
	}
	
	
	public void update(LocationStructure vehicleLocation, Date recordedAtTime) {
		//Will keep the queue to a size and then call to update average speed
		if(locations.size()>1) {
			LocationStructure tail = locations.peekLast(); 
			traveledSoFar += calculateDistance(vehicleLocation.getLatitude().doubleValue(), vehicleLocation.getLongitude().doubleValue(), tail.getLatitude().doubleValue(), tail.getLongitude().doubleValue());
		}
		locations.addLast(vehicleLocation);
		times.addLast(recordedAtTime);
		if(times.size()>K) {
			locations.removeFirst();
			times.removeFirst();		
			averageSpeed.removeFirst();
		}
		updatePointSpeeds();
		calculateAvgSpeed();	 
	}
		
	private void calculateAvgSpeed() {
		averageSpeed.add(currentAvgSpeed);
		currentAvgSpeed = average(pointSpeed);
		System.out.println("Bus " + this.vehicleRef + " has avg speed " + currentAvgSpeed);
	}

	private void updatePointSpeeds() {
		//Iterate, take two elements calculate delta and add to point speed
		for (int i = 0; i < locations.size(); i++) {
			LocationStructure loc = locations.get(i);		
			Double dist = Double.MIN_VALUE;
			Double lat1 = loc.getLatitude().doubleValue();
			Double lon1 = loc.getLongitude().doubleValue();
			
			Date d = times.get(i);
			
			if( i+1 < locations.size()) {
				loc = locations.get(i+1);
				Double lat2 = loc.getLatitude().doubleValue();
				Double lon2 = loc.getLongitude().doubleValue();
				dist = calculateDistance(lat1, lon1, lat2, lon2);
				
				Date d1 = times.get(i+1);
				DateTime dt1 = new DateTime(d);
				DateTime dt2 = new DateTime(d1);
				int seconds  = Seconds.secondsBetween(dt1, dt2).getSeconds();			
				pointSpeed.add((dist/seconds)*60);		
				System.out.println("BUS STATE-- Added point speed of "+ (dist/seconds)*60 + " for " +this.vehicleRef);
			} else break;
			
			
		}
		
	}

	private Double average(List<Double> vals) {
		Double res = 0d;
		if(vals.size() == 0) return res;
		for(Double val: vals) {
			res += val;
		}
		return res/vals.size();
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
	
	public static void main(String[] args) throws InterruptedException {
		BusState bus = new BusState("MTA NYCT_6633");
		Double longs[] = {-73.980696, -73.984333, -73.984513, -73.984549, -73.984549, -73.98539, -73.98539};
		Double lats[] = {40.753744, 40.748749, 40.748504, 40.748454, 40.748454, 40.747299, 40.747299};
		List<LocationStructure> locs = new ArrayList<LocationStructure>();
		
		for (int i = 0; i < lats.length; i++) {
			LocationStructure ls = new LocationStructure();
			ls.setLatitude(new BigDecimal(lats[i]));
			ls.setLongitude(new BigDecimal(longs[i]));
			locs.add(ls);
		}
		for (LocationStructure locationStructure : locs) {
			Date d = new Date(System.currentTimeMillis());
			bus.update(locationStructure, d);
			//System.out.println("Bus with id "+ bus.vehicleRef + " has avg-speed " + bus.averageSpeed);
			Thread.sleep(15000);
		}
		
	}
	

}
