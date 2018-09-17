package com.playground.trip.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cars {
	
	
	@JsonProperty("estimated_total")
	private EstimatedTotal totalAmount;
	

}
