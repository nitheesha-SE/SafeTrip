package com.playground.trip.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationResult {
	@JsonProperty("results")
	List<Locationvalues> locationvalues;

	public List<Locationvalues> getLocationvalues() {
		return locationvalues;
	}

	public void setLocationvalues(List<Locationvalues> locationvalues) {
		this.locationvalues = locationvalues;
	}

	@Override
	public String toString() {
		return "LocationResult [locationvalues=" + locationvalues + "]";
	}




}
