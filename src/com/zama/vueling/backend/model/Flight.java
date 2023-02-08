package com.zama.vueling.backend.model;

import java.time.LocalTime;

public class Flight {
	
	private String departureCity;
	private LocalTime time;
	
	
	public Flight(String departureCity, LocalTime time) {
		this.departureCity = departureCity;
		this.time = time;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return departureCity + " " + time;
	}
}
