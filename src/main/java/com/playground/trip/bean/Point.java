package com.playground.trip.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Point {
	@JsonProperty("coordinates")
	List<String> corodinates;

	public List<String> getCorodinates() {
		return corodinates;
	}

	public void setCorodinates(List<String> corodinates) {
		this.corodinates = corodinates;
	}

	@Override
	public String toString() {
		return "Point [corodinates=" + corodinates + "]";
	}

	
}
