package com.Abstraction1;

public class Driver {

	public static void main(String[] args) {
		LoginService loginService = new LoginService();
		loginService.doLogin("myuser", "Test@123");
	}

}
