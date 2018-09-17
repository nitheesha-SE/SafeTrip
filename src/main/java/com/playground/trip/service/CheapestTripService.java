package com.playground.trip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playground.trip.bean.CarInfo;
import com.playground.trip.bean.CarResults;
import com.playground.trip.bean.Trip;
import com.playground.trip.bean.HotelResults;
import com.playground.trip.bean.Hotels;
import com.playground.trip.bean.Output;
import com.playground.trip.bean.Results;
import com.playground.trip.client.CarInfoApi;
import com.playground.trip.client.FlightsInfoApi;
import com.playground.trip.client.HotelInfoApi;

@Service
public class CheapestTripService {
	
	@Autowired
	FlightsInfoApi flightsInfoApi;
	@Autowired
	HotelInfoApi hotelInfoApi;
	
	@Autowired
	CarInfoApi carInfoApi;
	
	public Trip getCheapestFlight(String origin, String destination, String departureDate, String returnDate)
	{
		Output results = flightsInfoApi.getLowerFlightDetails(origin, destination, departureDate, returnDate);
		Results result = results.getResults().get(0);
		result.setItineraries(result.getItineraries().subList(0, 3));
		
		Hotels hotel = getCheapestHotel(destination,departureDate,returnDate);
		
		CarInfo carinfo = getCheapestCar(destination, departureDate, returnDate);
		carinfo.setCars(carinfo.getCars().subList(0, 1));
		
		Trip trip = new Trip();
		trip.setHotels(hotel);
		trip.setResult(result);
		trip.setCarInfo(carinfo);
		
		return trip;
		
	}
	
	public Hotels getCheapestHotel(String location, String check_in, String check_out)
	{
		HotelResults hotels = hotelInfoApi.getLowerFlightDetails(location, check_in, check_out);
		return hotels.getResults().get(0);
	}
	
	public CarInfo getCheapestCar(String location , String pick_up , String drop_off)
	{
		CarResults carResults = carInfoApi.getLowerFlightDetails(location, pick_up, drop_off);
		
		return carResults.getResults().get(0);
		
	}

}
