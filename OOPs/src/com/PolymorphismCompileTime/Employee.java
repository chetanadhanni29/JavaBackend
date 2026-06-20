package com.PolymorphismCompileTime;

public class Employee {
	public void empLogin(String email, String pass) {
		System.out.println("Employee.empLogin(String email, String pass)");
	}
	
	public void empLogin(int mobNum, String pass) {
		System.out.println("Employee.empLogin(int mobNum, String pass)");
	}
	
	public void empLogin(int mobNum, int otp) {
		System.out.println("Employee.empLogin(int mobNum, int otp)");
	}
}
