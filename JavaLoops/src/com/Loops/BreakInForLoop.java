package com.Loops;

public class BreakInForLoop {

	public static void main(String[] args) {
		System.out.println("Main started");
		BreakInForLoop ca = new BreakInForLoop();
		ca.checkCity();
		System.out.println("Main ended");

	}
	
	public void checkCity() {
		String cities[] = {"Chennai" , "Bangalore", "Delhi", "Ahmedabad", "Jaipur", "Mysore"};
		
		for(int i = 0; i < cities.length; i++) {
			System.out.println("Inside Loop "+ (i+1));
			if(cities[i].equals("Bangalore")) {
				System.out.println("Bangalore Exists at index of "+ i);
				break;

			}
		}
	}

}