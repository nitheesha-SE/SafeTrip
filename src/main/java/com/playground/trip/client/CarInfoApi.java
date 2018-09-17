package com.playground.trip.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.playground.trip.bean.CarResults;

@Repository
public class CarInfoApi {
	private final String LowerPriceFlightUri = "https://api.sandbox.amadeus.com/v1.2/cars/search-airport?apikey=z8BEal0C5jI3jnJB9FhQQoJ4T2XDzEvp";
	RestTemplate restTemplate = new RestTemplate();
	
	public CarResults getLowerFlightDetails(String location , String pick_up , String drop_off)
	{
		String URI = LowerPriceFlightUri + "&location=" + location + "&pick_up=" + pick_up
				+ "&drop_off=" + drop_off;
		//System.out.println("/nURI " +URI);
		ResponseEntity<CarResults> output = restTemplate.getForEntity(URI, CarResults.class);
		
		return output.getBody();
	}
}
