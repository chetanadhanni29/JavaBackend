package com.Constructor;

class Delivery{
	String customerName;
	String itemDate;
	String deliveryDate;
	String status;
	
	public Delivery() {
		System.out.println("Default parameterized constructor");
	}
	
	public Delivery(String customerName, String itemDate, String deliveryDate, String status) {
		this.customerName = customerName;
		this.itemDate = itemDate;
		this.deliveryDate = deliveryDate;
		this.status = status;
	}
}

public class ConstructorDelivery {
	public static void main(String[] args) {
		Delivery d0 = new Delivery();
		System.out.println("Default parameterized constructor : " + d0.customerName);
		System.out.println("Default parameterized constructor : " + d0.itemDate);
		System.out.println("Default Parameterized constructor : " + d0.deliveryDate);
		System.out.println("Default Parameterized constructor : " + d0.status);
		System.out.println();
				
		Delivery d1 = new Delivery("Gowthu", "Dress", "01-04-2026", "Active");
		System.out.println("Customer 1 Parameterized constructor : " + d1.customerName);
		System.out.println("Customer 1 Parameterized constructor : " + d1.itemDate);
		System.out.println("Customer 1 Parameterized constructor : " + d1.deliveryDate);
		System.out.println("Customer 1 Parameterized constructor : " + d1.status);
	    System.out.println();
	    
		Delivery d2 = new Delivery("Fouziya", "Book", "05-04-2026", "Closed");
		System.out.println("Customer 2 Parameterized constructor : " + d2.customerName);
		System.out.println("Customer 2 Parameterized constructor : " + d2.itemDate);
		System.out.println("Customer 2 Parameterized constructor : " + d2.deliveryDate);
		System.out.println("Customer 2 Parameterized constructor : " + d2.status);
	    System.out.println();
	    
		Delivery d3 = new Delivery("Priya", "Stationary", "10-04-2026", "Active");
		System.out.println("Customer 3 Parameterized constructor : " + d3.customerName);
		System.out.println("Customer 3 Parameterized constructor : " + d3.itemDate);
		System.out.println("Customer 3 Parameterized constructor : " + d3.deliveryDate);
		System.out.println("Customer 3 Parameterized constructor : " + d3.status);
	
	}
}
 