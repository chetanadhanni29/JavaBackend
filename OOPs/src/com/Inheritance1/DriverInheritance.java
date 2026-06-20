package com.Inheritance1;

class Car{
	String name = "Car";
	int price = 1000000;
	String color = "White";
	
	public void printdet() {
		System.out.println("Car Name  : " + name);
		System.out.println("Car Price : " + price);
		System.out.println("Car Color : " + color);
	}
	public void start() {
		System.out.println("Start the Car");
	}
	public void drive() {
		System.out.println("Drive the Car");
	}
}

class CarAudi extends Car {

	public void feature() {
		name = "Audi Car";
		price = 2000000;
		color = "Black";
		System.out.println("Car Name  : " + name);
		System.out.println("Car Price : " + price);
		System.out.println("Car Color : " + color);
	}
	
	public void start() {
		System.out.println("Start the Audi Car");
	}
	public void drive() {
		System.out.println("Drive the Audi Car");
	}
	public void stop() {
		System.out.println("Stop the Audi Car");
	}
}

public class DriverInheritance {

	public static void main(String[] args) {
		Car c = new Car();
		CarAudi ca = new CarAudi();
		c.printdet();
		c.start();
		c.drive();
		System.out.println();
		ca.feature();
		ca.start();
		ca.drive();
		ca.stop();

		
		int a = 100;
		a = 200;
		System.out.println(a);
	}

}
