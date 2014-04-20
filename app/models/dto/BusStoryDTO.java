package models.dto;


public class BusStoryDTO{
	
	
	public String  ref;
	public String story;
	public String buslatlong;
	public String latlong;
	
	public BusStoryDTO(String ref, String story, String latlong,String buslatlong) {
		
		this.ref = ref;
		this.story = story;
		this.latlong = latlong;
		this.buslatlong = buslatlong;	
	}
	
	
}
