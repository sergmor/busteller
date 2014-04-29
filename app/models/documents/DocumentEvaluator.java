package models.documents;

import java.util.List;
import java.util.Vector;

public enum DocumentEvaluator {
	
	INSTANCE;
	//
	public List<SolutionEvaluation> sols = new Vector<SolutionEvaluation>();
	
	
	public void addSolution(SolutionEvaluation sol) {	
		sols.add(sol);
		System.out.println("got a new sol, I have " + sols.size());
	}
	
	
	
	
}
