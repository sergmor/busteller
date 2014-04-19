package models.dto;


public class BusStoryDTO{
	
	
	public String  ref;
	public String story;
	public String latlong;
	
	
	public BusStoryDTO(String ref, String story, String latlong) {
		
		this.ref = ref;
		this.story = story;
		this.latlong = latlong;
	}
	
	
}
