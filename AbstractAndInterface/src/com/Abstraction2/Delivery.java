package com.Abstraction2;

abstract class EcomDelivery {
	public abstract String addToCart(String itemName);
	public abstract void checkPrice(int price);
	public abstract void discountRate(double discount);
	
	public void printDetails() {
		System.out.println(addToCart("Laptop"));
	}
	
}

class Amazon extends EcomDelivery{

	@Override
	public String addToCart(String itemName) {
		return itemName;
	}

	@Override
	public void checkPrice(int price) {
		if(price > 0){
			System.out.println(price);
		}
	}
	
	@Override
	public void discountRate(double discount) {
		System.out.println(discount);
	}
	
} 

public class Delivery {

	public static void main(String[] args) {
		Amazon a = new Amazon();
		System.out.println(a.addToCart("Dress"));
		a.checkPrice(10000);
		a.discountRate(20);
		a.printDetails();
	}

}
