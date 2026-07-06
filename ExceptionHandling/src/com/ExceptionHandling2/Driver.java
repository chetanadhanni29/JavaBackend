package com.ExceptionHandling2;

public class Driver {
	// Use Ctrl + Shift + F --> Format the code
	public static void main(String[] args) {
		System.out.println("Driver.main() -- START");
		Order order = new Order();
		order.doSomething();
		System.out.println("Driver.main() -- END");
	}
}
