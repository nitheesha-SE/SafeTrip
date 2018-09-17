package com.playground.trip.bean;

public class Destination {
	
	private String airport;

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	@Override
	public String toString() {
		return "Destination [airport=" + airport + "]";
	}
}
