package models.documents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import models.dto.LandmarkDTO;
import models.places.Landmark;

public class SolutionEvaluation {
	
	public int W;
	public int N;
	public List<Landmark> options = new ArrayList<Landmark>();
	public List<LandmarkDTO> selected = new ArrayList<LandmarkDTO>();
	public int value;
	public Double precision;
	public Double recall;
	public Date timestamp;
	
	public SolutionEvaluation() {
		
	}
	
	public void prepareForEval() {
		Collections.sort(options);
	}
	
	public void evaluateSolution() {
		
	}
	
	public void stamp() {
		this.timestamp = new Date(System.currentTimeMillis());
	}
	
	
	
}
