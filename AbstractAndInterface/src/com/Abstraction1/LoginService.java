package com.Abstraction1;

public class LoginService {
	public boolean doLogin(String userID, String pwd) {
		
		// connect with databases
		// Do encryption / decryption
		// business logic to validate users
		
		connectToDB();
		encryption();
		promptPasswordReset();
		validateUsers();
		return true;
	}
	
	private void connectToDB() {
		System.out.println("LoginService.connectToDB()");
	}
	private void encryption() {
		System.out.println("LoginService.encryption()");
	}
	private void validateUsers() {
		System.out.println("LoginService.validateUsers()");
	}
	private void promptPasswordReset() {
		System.out.println("LoginService.promptPasswordReset()");
	}
}
