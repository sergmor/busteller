package models.places;

public class Filler implements Comparable<Filler> {
	public int id;
	public String text="";
	public int value;
	
	public Filler(int id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	
	public Landmark asLandmark() {
		return new Landmark("Filler "+ id,null,null,null,"",text); 
	}
	
	public int getValue() {
		return this.text.split(" ").length;
	}
	
	@Override
	public int compareTo(Filler f) {
		int compareQ = f.text.split(" ").length;		
		return compareQ-this.text.split(" ").length;
	}
}
