package com.ArrayList;

import java.util.ArrayList;

public class DriverArrayList {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>(); // default capacity : 10 --> increased by 50%

		cities.add("BLR");
		cities.add("CHE");
		cities.add("HYD");
		cities.add("AHM");
		cities.add("DEL");

		// access OR random read --> get the 3rd element
		System.out.println(cities.get(3)); // AHM --> O(1)

		cities.remove(1);

		System.out.println(cities);
	}

}