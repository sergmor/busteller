package models.places;

import java.math.BigDecimal;

import play.db.ebean.Model;

public class MovieLocation extends Model{
	
	long id;
	public String name;
	public BigDecimal latitude;
	public BigDecimal longitude;
	
	
}
