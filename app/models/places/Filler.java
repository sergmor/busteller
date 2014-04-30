package models.places;

import java.text.DecimalFormat;

import models.buses.BusState;

public class Filler implements Comparable<Filler> {
	public int id;
	public String text="";
	public int value;
	
	public Filler(int id, String text) {
		super();
		this.id = id;
		this.text = text;
		this.value = this.text.split(" ").length;
	}
	
	public Landmark asLandmark() {
		if(this.id == Integer.MIN_VALUE) return new Landmark("Real-Time Filler",null,null,null,"",text);
		else return new Landmark("Filler "+ id,null,null,null,"",text); 
	}
	
	public int getValue() {
		return this.text.split(" ").length;
	}
	
	@Override
	public int compareTo(Filler f) {
		int compareQ = f.text.split(" ").length;		
		return compareQ-this.text.split(" ").length;
	}
	
	public static Filler fromBusState(BusState bs) {
		String text ="";
		DecimalFormat df = new DecimalFormat("0.##");
		if(bs.currentAvgSpeed < 0.1d) {
			text = String.format("Hey I'm %s. It is soo slow today. My current avg speed is %s", bs.vehicleRef, df.format(bs.currentAvgSpeed));
			Filler f = new Filler(Integer.MIN_VALUE, text);
			return f;
		} else if(bs.traveledSoFar > 5){
			text = String.format("Hey I'm %s. I'm doing good its been %s miles since I've been tracked", bs.vehicleRef, df.format(bs.traveledSoFar));
			Filler f = new Filler(Integer.MIN_VALUE, text);
			return f;
		} else {
			text = String.format("Hey I'm %s. I'm A newbie, its been %s miles since I've been tracked", bs.vehicleRef, df.format(bs.traveledSoFar));
			Filler f = new Filler(Integer.MIN_VALUE, text);
			return f;
		}		
	}
}
