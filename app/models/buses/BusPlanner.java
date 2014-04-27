package models.buses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.uk.org.siri.siri.VehicleActivityStructure;
import models.uk.org.siri.siri.VehicleRefStructure;

public class BusPlanner {

	
	public List<VehicleActivityStructure> latestActivity = new ArrayList<VehicleActivityStructure>();
	public Map<String, BusState> locations = new HashMap<String, BusState>();
	
	public void updateActivity(List<VehicleActivityStructure> updated) {
		this.latestActivity = updated;
		updatePoints();		
	}

	private void updatePoints() {
		//iterate through list and get the bus ID and add to the map
		for(VehicleActivityStructure vas: latestActivity) {
			VehicleRefStructure ref = vas.getMonitoredVehicleJourney().getVehicleRef();
			
			if(locations.containsKey(ref.getValue())) {
				System.out.println(ref.getValue() + " exists will add pos");
				BusState bus = locations.get(ref.getValue());
				bus.update(vas.getMonitoredVehicleJourney().getVehicleLocation(), vas.getRecordedAtTime());				
			}else {
				BusState bus = new BusState(ref.getValue()); 
				bus.update(vas.getMonitoredVehicleJourney().getVehicleLocation(),vas.getRecordedAtTime());
				locations.put(ref.getValue(),bus);
				System.out.println("Creating " + ref.getValue());
			}
			
		}
		
	}
	
}
