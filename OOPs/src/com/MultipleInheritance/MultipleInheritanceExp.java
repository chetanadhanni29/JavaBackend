package com.MultipleInheritance;

class Gadget {
	public void parentMethod(String operatingSystem) {
		System.out.println("Parent Gadget Class    : " + operatingSystem);
	}
}

class SmartPhone extends Gadget {
	public void parentMethod(String operatingSystem) {
		System.out.println("Child SmartPhone Class : " + operatingSystem);
	}
}

class Laptop extends Gadget {
	public void parentMethod(String operatingSystem) {
		System.out.println("Child Laptop Class     : " + operatingSystem);
	}
}
class Tab extends Gadget {
	public void parentMethod(String operatingSystem) {
		System.out.println("Hybrid Class           : " + operatingSystem);
	}
}

public class MultipleInheritanceExp {

	public static void main(String[] args) {
		Gadget g = new Gadget();
		g.parentMethod("Andriod");
		SmartPhone sp = new SmartPhone();
		sp.parentMethod("iPhone");
		Laptop lp = new Laptop();
		lp.parentMethod("Windows");
		Tab t = new Tab();
		t.parentMethod("Mac");
		
	}

}
