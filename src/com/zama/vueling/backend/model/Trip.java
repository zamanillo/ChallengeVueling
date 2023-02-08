package com.zama.vueling.backend.model;

import java.util.List;

public class Trip {

	protected String tripName;
	protected String tripType;
	protected int duration;
	protected List<String> cities;

	public Trip() {

	}

	public Trip(String tripName, String tripType, int duration, List<String> cities) {

		this.tripName = tripName;
		this.tripType = tripType;
		this.duration = duration;
		this.cities = cities;
	}

	public String getTripName() {
		return tripName;
	}

	public void setTripName(String tripName) {
		this.tripName = tripName;
	}

	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}
}
