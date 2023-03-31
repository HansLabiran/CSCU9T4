package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry {
	private String terrain;
	private String tempo;

	public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String ter, String tem) {
		super(n, d, m, y, h, min, s, dist);
		// TODO Auto-generated constructor stub
		terrain = ter;
		tempo = tem;
	}

	/**
	 * @return the terrain
	 */
	public String getTerrain() {
		return terrain;
	}

	/**
	 * @return the tempo
	 */
	public String getTempo() {
		return tempo;
	}
	
	public String getEntry () {
		   String result = getName()+" ran " + getDistance() + " km in "
		             +getHour()+":"+getMin()+":"+ getSec() + " on "
		             +getDay()+"/"+getMonth()+"/"+getYear()+"\n"+getTerrain()+"/"+getTempo()+"/";
		   return result;
	
	}
}
