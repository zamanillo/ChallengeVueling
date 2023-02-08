package com.zama.vueling.backend.model;

import java.util.List;

public class AirTrip extends Trip{
	
	private List<Flight> flightList;

	public AirTrip(String tripName, int duration, List<String> cities, List<Flight> flightList) {
		super(tripName, "Air Trip", duration, cities);
		this.flightList = flightList;
	}

	public List<Flight> getFlightList() {
		return flightList;
	}

	public void setFlightList(List<Flight> flightList) {
		this.flightList = flightList;
	}
	
	@Override
	public String toString() {
		return  tripName + "; " + tripType + "; " + duration + " days; " + String.join(", ", cities)+"; "+  flightList.toString().replace("[", "").replace("]", "");
	}
}
