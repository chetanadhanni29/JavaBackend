package com.PolymorphismCompileTime;

public class SignUp {
	public boolean doRegister(String panCard, int opt) {
		System.out.println("SignUp.doRegister(String panCard, int opt)");
		return true;
	}
	
	public boolean doRegister(String panCard, String passport) {
		System.out.println("SignUp.doRegister(String panCard, String passport)");
		return true;
	}
	
	public boolean doRegister(String aadhar) {
		System.out.println("SignUp.doRegister(String aadhar)");
		return true;
	}
}
