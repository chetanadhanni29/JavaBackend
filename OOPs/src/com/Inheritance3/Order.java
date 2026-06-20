package com.Inheritance3;

public class Order extends Notification {
	String Name;
	int price;
	int qty;
	public int addCart(String Name, int price1, int qty) {
		if(Name != null) {
			int add = qty * price1;
			price += add;
			
		} else {
			System.out.println("Add item to cart");
		}
		OrderSMS(price);
		
		return price;
	}
	
	
}
