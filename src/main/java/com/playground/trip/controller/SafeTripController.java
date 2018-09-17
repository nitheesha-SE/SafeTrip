package com.playground.trip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.playground.trip.bean.Trip;
import com.playground.trip.service.CheapestTripService;
import com.playground.trip.service.FastestTripService;

@RestController
public class SafeTripController {
	
	@Autowired
	CheapestTripService cheapestTripService;
	
	@Autowired
	FastestTripService fastestTripService;
	
	@GetMapping("/cheapestflights")
	public Trip getChepeastFlight(@RequestParam("origin") String origin, @RequestParam("destination") String destination, @RequestParam("departureDate") String departureDate, @RequestParam("returnDate") String returnDate)
	{
		return cheapestTripService.getCheapestFlight(origin, destination, departureDate, returnDate);
	}
	
	@GetMapping("/fastestflights")
	public Trip getFastestFlight(@RequestParam("origin") String origin, @RequestParam("destination") String destination, @RequestParam("departureDate") String departureDate, @RequestParam("returnDate") String returnDate)
	{
		return fastestTripService.getFastestTrip(origin, destination, departureDate, returnDate);
	}
	

}
