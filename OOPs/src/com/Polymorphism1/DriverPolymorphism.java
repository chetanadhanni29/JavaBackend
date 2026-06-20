package com.Polymorphism1;

class Delivery {
	public void doDelivery() {
		System.out.println("Delivery.doDelivery");
	}
}

class EcomDelivery extends Delivery {
	@Override
	public void doDelivery() {
		System.out.println("EcomDelivery.doDelivery");
	}
}

public class DriverPolymorphism {

	public static void main(String[] args) {
		EcomDelivery ecomDelivery = new EcomDelivery(); 
		ecomDelivery.doDelivery();
		
		// parent class can refer child class object(Auto up casting)
		Delivery delivery = new EcomDelivery();
		// compile time it check + it call based on actual object
		delivery.doDelivery(); 
	}

}
