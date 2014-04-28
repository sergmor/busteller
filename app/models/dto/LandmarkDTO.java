package models.dto;


public class LandmarkDTO {

	public String placelat;
	public String placelng;
	public String name;
	public String story;
	public LandmarkDTO(String placelat, String placelng, String name,
			String story) {
		super();
		this.placelat = placelat;
		this.placelng = placelng;
		this.name = name;
		this.story = story;
	}
	
	public LandmarkDTO(String placelat, String placelng, String name) {
		super();
		this.placelat = placelat;
		this.placelng = placelng;
		this.name = name;		
	}
	
	
	
}
