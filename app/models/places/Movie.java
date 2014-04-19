package models.places;

import java.util.List;

import play.db.ebean.Model;

public class Movie extends Model {
	
	public String name;
	long id;
	public List<MovieLocation> locations;
	
}
