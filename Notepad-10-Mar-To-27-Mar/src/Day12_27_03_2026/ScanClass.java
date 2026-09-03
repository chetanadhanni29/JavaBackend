package Day12_27_03_2026;

//package com.kodewala;

import java.util.Scanner;

class ScanClass {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first name");
		String firstName = scan.next();

		System.out.println("Please enter last name");
		String lastNname = scan.next();

		System.out.println("Please enter DOB year");
		int dob = scan.nextInt();

		System.out.println("Student first name : " + firstName);
		System.out.println("Student last name  : " + lastNname);
		System.out.println("Student Dob        : " + dob);

	}
}
