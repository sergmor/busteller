package models.documents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import scala.Array;
import models.dto.LandmarkDTO;
import models.places.Landmark;
import models.places.StoryType;

public class SolutionEvaluation {

	public int W;
	public int N;
	public List<Landmark> options = new ArrayList<Landmark>();
	public List<LandmarkDTO> selected = new ArrayList<LandmarkDTO>();
	public int value;
	public Double precision;
	public Double recall;
	public Date timestamp;
	private static final Double AT_RECALL=5d;
	private static final Double AT_PRECISION=5d;
	
	public SolutionEvaluation() {

	}

	public void prepareForEval() {
		Collections.sort(options);
	}

	public void evaluateSolution() {
		prepareForEval();
		recall = calculateRecall();
		precision = calculatePrecision();
	}

	private Double calculatePrecision() {
		Double res = 0d;
		int limit = options.size() >= 5 ? (AT_PRECISION.intValue()) : options.size();
		List<Landmark> check = new ArrayList<Landmark>();
		for(int i=0; i<limit; i++) {
			check.add(options.get(i));
		}

		for(int i=0; i<limit ; i++) {
			
			Landmark lm = check.get(i);
			for(int j=0; j<selected.size(); j++) {
				LandmarkDTO lmdto = selected.get(j);
				if(lm.name.equalsIgnoreCase(lmdto.name)) {					
					res += (lmdto.st.equals(StoryType.LONG)) ? 1 : 0.8D;
					continue;
				}
			}
		}

		return res/AT_PRECISION;
	}

	private Double calculateRecall() {
		Double res = 0d;
		
		int limit = options.size() >= 5 ? (AT_RECALL.intValue()) : options.size();
		List<Landmark> check = new ArrayList<Landmark>();
		for(int i=0; i<limit; i++) {
			check.add(options.get(i));
		}

		for(int i=0; i<limit ; i++) {
			Landmark lm = check.get(i);
			for(int j=0; j<selected.size(); j++) {
				if(lm.name.equalsIgnoreCase(selected.get(j).name)) {					
					res++;
					continue;
				}
			}
		}

		return res/AT_RECALL;
	}

	public void stamp() {
		this.timestamp = new Date(System.currentTimeMillis());
	}

	@Override
	public String toString() {
		return String.format("Solution has capacity %d with %d elements with value %d. "
				+ "Precicion %f and recall %f", W,N,value,precision,recall);
	}



}
