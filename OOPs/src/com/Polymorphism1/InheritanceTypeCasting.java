package com.Polymorphism1;

class Parent {
    public void parentClass(){
        System.out.println("Parent class");
    }
}
class Child extends Parent {
    public void parentClass(){
        System.out.println("Child class");
    }
}

public class InheritanceTypeCasting {

	public static void main(String[] args) {
		// Parent class can refer Child class object
		Parent p = new Child(); // Auto Up casting
		// No compile time error but run time error
        Child c = (Child) new Parent(); // Down casting 
	}

}
