package com.ExceptionHandling1;

public class Test {
	
	static int someValue;
	public static void main(String[] args) { // +ve --> Happy Scenario
		System.out.println("This is sample program - START");
		String name = "Bangalore";// "Bangalore" or null
		try {
			int amount = 200/0;
			System.out.println("Amount " + amount);
			System.out.println("Before Exception");
			System.out.println("Length " + name.length()); // Risky --> may throw an Exception
			System.out.println("After Exception"); // skipped in case of NPE
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Name is null..."); // Message
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Can't divide by Zero"); // Message
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong..."); // Message
		}
		System.out.println("Order placed...");
		System.out.println("This is sample program - END");
		
	}

}
