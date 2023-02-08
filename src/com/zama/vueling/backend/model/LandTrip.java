package com.zama.vueling.backend.model;

import java.util.List;

public class LandTrip extends Trip{
	
	private List<Hotel> hotelList;

	public LandTrip(String tripName, int duration, List<String> cities, List<Hotel> hotelList) {
		super(tripName, "Land Trip", duration, cities);
		this.hotelList = hotelList;
	}

	public List<Hotel> getHotelList() {
		return hotelList;
	}

	public void setHotelList(List<Hotel> hotelList) {
		this.hotelList = hotelList;
	}

	@Override
	public String toString() {
		return  tripName + "; " + tripType + "; " + duration + " days; " + String.join(", ", cities)+" "+  hotelList.toString().replace("[", "").replace("]", "");
	}
}
