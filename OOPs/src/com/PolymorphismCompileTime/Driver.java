package com.PolymorphismCompileTime;

public class Driver {

	public static void main(String[] args) {
		
		SignUp signUp = new SignUp();
		signUp.doRegister("6543-8535-2575"); // compile time Polymorphism
		
		Employee employee = new Employee();
		employee.empLogin("chet@gmail.com", "Chetana");
		employee.empLogin(542246650, 1234);
		

	}

}
