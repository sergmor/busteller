package models.buses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import models.uk.org.siri.siri.VehicleActivityStructure;
import models.uk.org.siri.siri.VehicleRefStructure;

public enum BusPlanner {

	INSTANCE;
	public List<VehicleActivityStructure> latestActivity = new ArrayList<VehicleActivityStructure>();
	public Map<String, BusState> locations = new HashMap<String, BusState>();
	public Double radius = 0.0d;
	public Double EPSILON_T = 60d;
	
	public void updateActivity(List<VehicleActivityStructure> updated) {
		this.latestActivity = updated;
		System.out.println("BP--- about to update");
		updatePoints();		
	}
	
	public BusState getBusById(String id) {
		BusState res = locations.containsKey(id) ? locations.get(id) : null;
		return res;
	}
	
	public boolean isTakingLonger(String id) {
		boolean res = false;
		if(!locations.containsKey(id)) 
			return res;
		BusState bus = locations.get(id);
		Double prevTime = radius/bus.averageSpeed.peekLast();
		Double currentTime = findTimeToExit(id);
		if(Math.abs(prevTime-currentTime) >= EPSILON_T) 
			res = true;
		return res;
	}
	
	public Double findTimeToExit(String id) {
		Double res = Double.MIN_VALUE;
		if(locations.containsKey(id)) {
			BusState bus = locations.get(id);
			res = radius/bus.currentAvgSpeed;
		}
		return res;
	}
	
	public Set<String> getBuses(){
		
		return locations.keySet(); 
		
	}
	
	
	private void updatePoints() {
		//iterate through list and get the bus ID and add to the map
		for(VehicleActivityStructure vas: latestActivity) {
			VehicleRefStructure ref = vas.getMonitoredVehicleJourney().getVehicleRef();
			
			if(locations.containsKey(ref.getValue())) {
				System.out.println("BP----" +ref.getValue() + " exists will add new location");
				BusState bus = locations.get(ref.getValue());
				bus.update(vas.getMonitoredVehicleJourney().getVehicleLocation(), vas.getRecordedAtTime());				
			}else {
				BusState bus = new BusState(ref.getValue()); 
				bus.update(vas.getMonitoredVehicleJourney().getVehicleLocation(),vas.getRecordedAtTime());
				locations.put(ref.getValue(),bus);
				System.out.println("Created " + ref.getValue());
			}			
		}		
	}
	
	
	
	
}
