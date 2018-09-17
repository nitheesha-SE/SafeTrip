package com.playground.trip.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarResults {

	private List<CarInfo> results;

	public List<CarInfo> getResults() {
		return results;
	}

	public void setResults(List<CarInfo> results) {
		this.results = results;
	}


	
}
