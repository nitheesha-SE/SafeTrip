package com.playground.trip.bean;

import java.util.List;

public class Outbound {
	
	private String duration;
	private List<Flights> flights;

	public String getDuration() {
		return duration;
	}

	public List<Flights> getFlights() {
		return flights;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public void setFlights(List<Flights> flights) {
		this.flights = flights;
	}

	@Override
	public String toString() {
		return "Outbound [duration=" + duration + ", flights=" + flights + "]";
	}
}
