package models.documents;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import models.buses.BusPlanner;
import models.buses.BusState;
import models.dto.BusStoryDTO;
import models.places.Filler;
import models.places.Landmark;
import models.places.Places;
import models.places.StoryType;

public class DocumentPlanner {
	
	
	public Map<String, BusStoryDTO> sacks = new HashMap<String, BusStoryDTO>();
	private final int WPM = 80;
	private final Double EPSILON_R = 0.10D;
	private final Double FILLER_T = 0.8D;
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
		BusState bus = BusPlanner.INSTANCE.getBusById(id);
		List<Landmark> landmarks = Places.getNearby(bus.getLat(), bus.getLon(), radius);
		int N = landmarks.size()*2;
		System.out.println("DOC PLAN--- Will pack " + id + " with maximum total cap " + W + " and " + N + " elems");
		BusStoryDTO res = new BusStoryDTO(bus);
		//Calculate values and weights from landmarks. Values are relevance
		//weights the number of words in their long/short description
		Double[] vals = createValues(landmarks);
		Double[] weights = createWeights(landmarks);
		if(N == 0) {
			System.out.println("DOC PLAN--- FAILED No places nearby Just shooting for fillers");
			List<Landmark> fillers = createFillers(W,0);
			for(Landmark f : fillers) {
				res.addLandmarks(f, StoryType.FILLER);
			}
			
			return res;
		}
		//Create objects for evaluation
		SolutionEvaluation se = new SolutionEvaluation();
		se.N = N;
		se.W = W;
		se.options = landmarks;
		
		//Initialize Matrix
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
            	if(res.containsLandmark(lm.name)) continue;
                Double weight = weights[i-1];                
                if(weight == lm.getLongWeight()) {                	
                	res.addLandmarks(lm, StoryType.LONG);
                	System.out.println("adding " + lm.name + " to bus " + res.busId + " long");
                } else {
                	res.addLandmarks(lm, StoryType.SHORT);
                	System.out.println("adding " + lm.name + " to bus " + res.busId + " short");
                }
                
                j -= weight.intValue();
                solutionWeight += weight;                
            }
        } 
		
		System.out.println("Created a sol for " + res.busId + " with total "+ solutionWeight + " out of " + W);
		se.selected = res.landmarks;
		DocumentEvaluator.INSTANCE.addSolution(res.busId, se);
		if(solutionWeight < Math.floor(W*FILLER_T)) {
			System.out.println("Solution has less than " + FILLER_T + " adding Fillers");
			List<Landmark> fillers = createFillers(W,solutionWeight);
			for(Landmark f : fillers) {
				res.addLandmarks(f, StoryType.FILLER);
			}
		}
		return res;
	}
	
	private List<Landmark> createFillers(int W, int sol){
		List<Landmark> res = new ArrayList<Landmark>();
		int soFar = sol;
		int i = 0;
		Filler f = Places.INSTANCE.getFiller(i);
		int max = Places.INSTANCE.howManyFillers()-1;
		int value = f.text.split(" ").length; 
		while (soFar + value < W && i < max) {
			res.add(f.asLandmark());
			soFar += value; 
			i++;
			value = f.text.split(" ").length;
			f = Places.INSTANCE.getFiller(i);
		}
		System.out.println("FILLER---- Achieved " + soFar + " from " + sol + " out of " + W);
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
