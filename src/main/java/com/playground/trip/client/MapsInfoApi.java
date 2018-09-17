package com.playground.trip.client;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import com.playground.trip.bean.DistanceResults;
import com.playground.trip.bean.DistanceRows;
import com.playground.trip.bean.GeoLocation;
import com.playground.trip.bean.Location;
import com.playground.trip.bean.LocationResult;

@Repository
public class MapsInfoApi {
	private final String distanceApi = "https://maps.googleapis.com/maps/api/distancematrix/json?key=AIzaSyAv6ik5jhnd8K4d2g4iQhnA1I_JFwPPxqM";
	private final String locationsApi = "https://maps.googleapis.com/maps/api/geocode/json?key=AIzaSyAv6ik5jhnd8K4d2g4iQhnA1I_JFwPPxqM";
	RestTemplate restTemplate = new RestTemplate();
	public GeoLocation getlatlongDetails(String destination)
	{
		String url=locationsApi+ "&address=" +destination+"+Airport";
		System.out.println("latituteLongitude"+url);
		ResponseEntity<LocationResult> output = restTemplate.getForEntity(url, LocationResult.class);
		//System.out.println(output.getBody());
		return output.getBody().getLocationvalues().get(0).getGeometry().getLocation();
	}
	
	public DistanceRows getDistanceMatrix(GeoLocation location1, List<Location> point2)
	{
		StringBuilder url = new StringBuilder();
		url  = url.append(distanceApi).append("&origins=").append(location1.getLatitude()).append(",").append(location1.getLongitude()).append("&destinations=");
		for(Location l: point2)
		{
			url.append(l.getLatitude()).append(",").append(l.getLongitude()).append("|");
		}
		url.deleteCharAt(url.length() - 1);
		String u1 = url.toString();
		System.out.println("distancematrix: "+u1);
		//String url = distanceApi+ "&origins="+point1.getLatitude()+","+point1.getLongitude()+"&destinations="+point2.getLatitude()+","+point2.getLongitude();
		ResponseEntity<DistanceResults> output = restTemplate.getForEntity(u1, DistanceResults.class);
		
		return output.getBody().getDistanceRows().get(0);
	}

}