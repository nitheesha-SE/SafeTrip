package com.playground.trip.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DistanceResults {

	@JsonProperty("rows")
	List<DistanceRows> distanceRows;

	public List<DistanceRows> getDistanceRows() {
		return distanceRows;
	}

	public void setDistanceRows(List<DistanceRows> distanceRows) {
		this.distanceRows = distanceRows;
	}

	@Override
	public String toString() {
		return "DistanceResults [distanceRows=" + distanceRows + "]";
	}


	
}
