package com.playground.trip.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.playground.trip.bean.Output;

@Repository
public class FlightsInfoApi {

	private final String LowerPriceFlightUri = "https://api.sandbox.amadeus.com/v1.2/flights/low-fare-search?apikey=z8BEal0C5jI3jnJB9FhQQoJ4T2XDzEvp";
	RestTemplate restTemplate = new RestTemplate();
	
	public Output getLowerFlightDetails(String origin, String destination, String departureDate, String returnDate)
	{
		String URI = LowerPriceFlightUri + "&origin=" + origin + "&destination=" + destination
				+ "&departure_date=" + departureDate + "&return_date=" + returnDate;
		//System.out.println("/nURI " +URI);
		ResponseEntity<Output> output = restTemplate.getForEntity(URI, Output.class);
		if(output.getBody() != null)
		{
			return output.getBody();
		}
		else
			return null;
	}
}
