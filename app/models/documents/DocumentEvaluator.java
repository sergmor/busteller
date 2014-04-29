package models.documents;

import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public enum DocumentEvaluator {
	
	INSTANCE;
	//
	public Map<String,List<SolutionEvaluation>> sols = new ConcurrentHashMap<String,List<SolutionEvaluation>>();
	
	
	public void addSolution(String busId, SolutionEvaluation sol) {;	
		sol.stamp();
		if(sols.containsKey(busId)) {
			List<SolutionEvaluation> list = sols.get(busId);
			list.add(sol);
			sols.put(busId, list);
		} else {
			List<SolutionEvaluation> list = new Vector<SolutionEvaluation>();
			list.add(sol);
			sols.put(busId, list);
		}		
	}
	
	public List<SolutionEvaluation> getEvaluations(String busId){
		List<SolutionEvaluation> res = sols.containsKey(busId) ? sols.get(busId) : null;		
		return res;
	}
	
	
	
	
}
