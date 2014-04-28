package models.places;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import models.loader.DataLoader;
import play.db.ebean.Model;

public class Landmark extends Model{
	
	public String name;
	public Date designation;
	public BigDecimal latitude;
	public BigDecimal longitude;
	public String county;
	public int relevance;
	public String description;
	public String longDescription = null;
	
	public Landmark(String name, Date designation, BigDecimal latitude,
			BigDecimal longitude, String county, String description) {
		super();
		this.name = name;
		this.designation = designation;
		this.latitude = latitude;
		this.longitude = longitude;
		this.county = county;
		this.description = description;		
	}
	
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("MMMMMMMM dd, YYYY");
		return String.format("Did you know that %s was designated as a landmark on %s because %s",
				this.name, sdf.format(designation),description,relevance);
	}
	
	public String getLatlng() {
		return latitude.toString() + ";" + longitude.toString();
	}
	
	public int getSimpleWeight() {
		return description.split(" ").length;
	}
	
	public int getLongWeight() {
		return longDescription.split(" ").length;
	}
	
	public static void main(String[] args) {
		DataLoader.INSTANCE.loadData();
		List<Landmark> l = Places.landmarks;
		System.out.println(l.size());
		for (Landmark landmark : l) {
			System.out.println("SHORT----");
			System.out.println(landmark.toString());
			System.out.println("LONG----");
			System.out.println(landmark.longDescription);
			if(landmark.relevance == 0)
				System.out.println("RELEVANCE-----"+landmark.name);
			if(landmark.longDescription == null)
				System.out.println("DESCRIPTION-----"+landmark);
		}
	}
	
	
}
