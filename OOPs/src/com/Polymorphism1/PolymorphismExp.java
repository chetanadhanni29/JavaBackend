package com.Polymorphism1;

class Manager {
	public void project(String proj, int budget) {
		System.out.println("Project from manager " + proj + " with Budget of " + budget);
	}
}

class Employee extends Manager {
	@Override
	public void project(String proj, int budget) {
		System.out.println("Project from Employee " + proj + " with Budget of " + budget);
	}
}

public class PolymorphismExp {

	public static void main(String[] args) {
		Manager m = new Employee();
		m.project("Amazon", 1000000);

	}

}
