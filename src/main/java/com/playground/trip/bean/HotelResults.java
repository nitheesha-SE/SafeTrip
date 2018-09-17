package com.playground.trip.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelResults {
	private List<Hotels> results;

	public List<Hotels> getResults() {
		return results;
	}

	public void setResults(List<Hotels> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "HotelResults [results=" + results + "]";
	}

	
	
	

}
