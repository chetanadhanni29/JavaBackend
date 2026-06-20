package com.Interface6Marker;

public class Person implements Cloneable {
	
	String name;
	
	Person(String name) {
		this.name = name;
	}
	
	@Override
	public Person clone() throws CloneNotSupportedException {
		return (Person) super.clone(); // Object class clone
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person("Kodewala");
		
		Person p1 = p.clone();
		System.out.println(" p " + p.name);
		System.out.println(" p1 " + p1.name);
		
		if(p instanceof Cloneable) { // True if Person object is type of Cloneable --> person class should implement Cloneable interface
			System.out.println("p is type of Cloneable");
		} else {
			System.out.println("p is not a type of Cloneable, You cannot clone the object of Person class");
		}
	}
}
