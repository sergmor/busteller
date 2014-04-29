package models.dto;

import models.places.StoryType;


public class LandmarkDTO {

	public String placelat;
	public String placelng;
	public String name;
	public String story;
	public StoryType st;
	
	public LandmarkDTO(String placelat, String placelng, String name,
			String story, StoryType st) {
		super();
		this.placelat = placelat;
		this.placelng = placelng;
		this.name = name;
		this.story = story;
		this.st = st;
	}
	
	public LandmarkDTO(String placelat, String placelng, String name) {
		super();
		this.placelat = placelat;
		this.placelng = placelng;
		this.name = name;		
	}
	
	
	
	
	
}
