package com.playground.trip.bean;

import java.util.List;

public class Inbound {
	private String duration;
	
	private List<Flights> flights;

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<Flights> getFlights() {
		return flights;
	}

	public void setFlights(List<Flights> flights) {
		this.flights = flights;
	}

	@Override
	public String toString() {
		return "Outbound [duration=" + duration + ", flights=" + flights + "]";
	}
}
