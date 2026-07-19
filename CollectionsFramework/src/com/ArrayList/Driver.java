package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Driver {

	public static void main(String[] args) {
		// Task --> Create an array list and store the elements
		ArrayList<String> studentList = new ArrayList<String>(); // Cap : 10,  Create an object of ArrayList and store String object
		
		studentList.add("Gowthu"); // Added String object to the List
		studentList.add("Krish");
		studentList.add("Fouziya");
		studentList.add("Priya");
		studentList.add("Usha");
		studentList.add("Dhanu");
		studentList.add("Pavan");
		studentList.add("Prasad");
		studentList.add("Santhu");
		studentList.add("Rounak");
		studentList.add("Vishwas");
		studentList.add("Ritesh");
		System.out.println(studentList.get(1));
		
        // System.out.println(studentList.get(3));
		// Index based -->
		// apply some operation.. find the names which start with
		
		for (int i = 0; i < studentList.size(); i++) {
			String currentElement = studentList.get(i);
			if(currentElement.toUpperCase().startsWith("P")) {
				System.out.println(currentElement);
			}
		}
	}

}
