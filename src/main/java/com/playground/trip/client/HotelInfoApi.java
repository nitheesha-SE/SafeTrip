package com.playground.trip.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.playground.trip.bean.HotelResults;

@Repository
public class HotelInfoApi {
	private final String LowerHotelUri = "https://api.sandbox.amadeus.com/v1.2/hotels/search-airport?apikey=z8BEal0C5jI3jnJB9FhQQoJ4T2XDzEvp";
	RestTemplate restTemplate = new RestTemplate();
	
	public HotelResults getLowerFlightDetails(String location, String check_in, String check_out)
	{
		String URI = LowerHotelUri + "&location=" + location + "&check_in=" + check_in
				+ "&check_out=" + check_out + "&number_of_results=" + 3;
		//System.out.println("/nURI " +URI);
		ResponseEntity<HotelResults> hotelResults = restTemplate.getForEntity(URI, HotelResults.class);
		
		//List<Hotels> hotels = ;
		//System.out.println(hotelResults);
		return hotelResults.getBody();
	}
}
