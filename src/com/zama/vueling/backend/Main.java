package com.zama.vueling.backend;

import com.zama.vueling.backend.model.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input;

		List<Trip> tripList = loadDataTravels();
		List<Trip> tripListOut;

		do {
			System.out.println(
					"\nCity you want to search for or at least three letters that the city contains. \nPress 0 to exit.");
			input = scanner.nextLine();

			// como mínimo 3 caracteres
			if (input.length() < 3) {
				
				System.out.println(input.equalsIgnoreCase("0")?"Thaks!! Come back soon!":"Please enter at least three letters!");
			}

			else {

				tripListOut = searchByCityName(input, tripList);

				if (tripListOut.size() > 0) {

					tripListOut.stream().forEach(System.out::println);
				} else {

					System.out.println("Not results for that search!");
				}
			}
		} while (!input.equals("0"));

		scanner.close();

	}

	// método que devuelve una lista de viajes en los que alguna de las ciudades
	// contenga la cadena cityname
	public static List<Trip> searchByCityName(String cityName, List<Trip> tripList) {

		List<Trip> tripListOut;

		tripListOut = tripList.stream().filter(
				trip -> trip.getCities().stream().anyMatch(city -> city.toLowerCase().contains(cityName.toLowerCase())))
				.toList();

		return tripListOut;
	}

	// carga una lista de viajes fake como si hiciera una consulta a BD
	public static List<Trip> loadDataTravels() {

		List<Trip> tripList = new ArrayList<>();

		Trip trip1 = new LandTrip("Europe Popular Capitals", 3, List.of("Madrid", "Paris", "London"),
				List.of(new Hotel("Hotel Best Madrid", "3*"), new Hotel("Hotel Worst Paris", "4*")));
		Trip trip2 = new LandTrip("Europe laying out cities", 3, List.of("Madrid", "Berlin"),
				List.of(new Hotel("Hotel Best Madrid", "3*"), new Hotel("Hotel Worst Berlin", "4*")));
		Trip trip3 = new LandTrip("Europe modern cities", 4, List.of("Barcelona", "Berlin"),
				List.of(new Hotel("Hotel Best Barcelona", "5*"), new Hotel("Hotel Worst Berlin", "4*")));
		Trip trip4 = new LandTrip("Spanish cities", 3, List.of("Madrid", "Barcelona"),
				List.of(new Hotel("Hotel Best Madrid", "3*"), new Hotel("Hotel Best Barcelona", "5*")));
		Trip trip5 = new AirTrip("Infinite Egipt", 4, List.of("Madrid", "القاهرة‎", "الأقصر‎"), List
				.of(new Flight("Madrid", LocalTime.of(9, 00, 00)), new Flight("الأقصر‎", LocalTime.of(10, 00, 00))));
		Trip trip6 = new AirTrip("Incredible China", 10, List.of("Barcelona", "Madrid", "广州市", "北京市"),
				List.of(new Flight("Madrid", LocalTime.of(9, 00, 00)), new Flight("北京市", LocalTime.of(10, 00, 00))));
		tripList.add(trip1);
		tripList.add(trip2);
		tripList.add(trip3);
		tripList.add(trip4);
		tripList.add(trip5);
		tripList.add(trip6);

		return tripList;
	}
}
