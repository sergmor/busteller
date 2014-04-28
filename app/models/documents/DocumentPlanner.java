package models.documents;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import models.buses.BusPlanner;
import models.buses.BusState;
import models.dto.BusStoryDTO;
import models.places.Landmark;
import models.places.Places;

public class DocumentPlanner {
	
	
	public Map<String, BusStoryDTO> sacks = new HashMap<String, BusStoryDTO>();
	private final int WPM = 80;
	private final Double EPSILON_R = 0.10D;
	public Double radius; 
	
	
		
	public Map<String,BusStoryDTO> pack(Double radius) {
		
		BusPlanner.INSTANCE.radius = radius;
		// Iterate over buses, get places for radius pack bus
		Set<String> buses = BusPlanner.INSTANCE.getBuses();
		int W = 0;
		for (Iterator<String> iterator = buses.iterator(); iterator.hasNext();) {
			String busID =  iterator.next();
			BusState bus = BusPlanner.INSTANCE.getBusById(busID);									
			W = (int) Math.floor(WPM*BusPlanner.INSTANCE.findTimeToExit(busID));
			//makes no sense to pack standing buses...
			if(bus.currentAvgSpeed == 0) continue;
			if(W == 0) continue;
			//Check where the bus is and decide if it need packing
			if( (Math.abs(radius-bus.traveledSoFar) <= EPSILON_R*radius)){				
				//Check that our new list of landmarks will not contain old landmarks
				BusStoryDTO packed = packBus(busID, W);
				sacks.put(busID, packed);
			} else if(!sacks.containsKey(busID)) { //the bus has never been packed
				BusStoryDTO packed = packBus(busID, W);
				sacks.put(busID, packed);
			} else if (BusPlanner.INSTANCE.isTakingLonger(busID)) { //The bus average speed has changed
				//Check that our new list of landmarks will not contain old landmarks
				BusStoryDTO packed = packBus(busID, W);
				sacks.put(busID, packed);
			}
			
		}
		return sacks;
	}

	private BusStoryDTO packBus(String id, int W) {
		//Define total capacity
		System.out.println("DOC PLAN--- Will pack " + id + " with maximum total cap " + W );
		BusState bus = BusPlanner.INSTANCE.getBusById(id);
		List<Landmark> landmarks = Places.getNearby(bus.getLat(), bus.getLon(), radius);
		int N = landmarks.size()*2;
		BusStoryDTO res = new BusStoryDTO(bus);
		//Calculate values and weights from landmarks. Values are relevance
		//weights the number of words in their long/short description
		Double[] vals = createValues(landmarks);
		Double[] weights = createWeights(landmarks);
		
		Double[][] mat = new Double[N][W];
		//Do something!
		for(int j = 0; j < W; j++) {
			mat[0][j] = 0d;
		}
		for(int i = 1 ; i < N; i++) {
			for (int j = 0 ; j < W ; j++) {
				if(weights[i] < j) {
					mat[i][j] = Math.max(mat[i-1][j], mat[i-1][ (int) (j- weights[i]) ] + vals[i]); 
				}
				else {
					mat[i][j] = mat[i-1][j];
				}
			}
		}	
		
		
		int solutionWeight=0;
		for (int i = N-1, j = W-1; i > 0  &&  j >= 0; i--) {
            Double tempI   = mat[i][j];
            Double tempI_1 = mat[i-1][j];
            if (
                (i == 0  &&  tempI > 0)
                ||
                (i > 0  &&  tempI != tempI_1)
            )
            {
                Landmark lm = landmarks.get((i-1)%landmarks.size());
                Double weight = weights[i-1];
                res.addLandmarks(lm);
                if(weight == lm.getSimpleWeight()) {                	
                	res.addStories(lm.name,lm.description);
                	System.out.println("adding " + lm.name + " to bus " + res.busId + " short");
                } else {
                	res.addStories(lm.name, lm.longDescription);
                	System.out.println("adding " + lm.name + " to bus " + res.busId + " long");
                }
                
                j -= weight.intValue();
                solutionWeight += weight;                
            }
        } 

		System.out.println("Created a sol for " + res.busId + " with total "+ solutionWeight + " out of " + W);
		
		return res;
	}
	private Double[] createWeights(List<Landmark> landmarks) {
		Double[] res = new Double[2*landmarks.size()];
		for (int i = 0; i < landmarks.size(); i++) {
			Landmark lm = landmarks.get(i);
			res[i] = (double) lm.description.split(" ").length;
			res[i+landmarks.size()] = (double) lm.longDescription.split(" ").length; 
		}
		return res;
	}
	private Double[] createValues(List<Landmark> landmarks) {
		Double[] res = new Double[2*landmarks.size()];
		for (int i = 0; i < landmarks.size(); i++) {
			Landmark lm = landmarks.get(i);
			res[i] = Math.floor(lm.relevance)*.8;
			res[i+landmarks.size()] = (double) lm.relevance;
			 
		}
		return res;
	}
	
	
}
