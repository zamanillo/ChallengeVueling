package com.zama.vueling.backend.model;

public class Hotel {

	private String name;
	private String categori;

	public Hotel() {

	}

	public Hotel(String name, String categori) {

		this.name = name;
		this.categori = categori;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategori() {
		return categori;
	}

	public void setCategori(String categori) {
		this.categori = categori;
	}

	@Override
	public String toString() {
		return name + " " + categori;
	}
}
