package com.Encapsulation2;

public class Driver {

	public static void main(String[] args) {
		Account a = new Account();
		
		System.out.println("Initial Balance        : " + a.getBalance());
		
		a.deposit(1000000);
		
		System.out.println("Balance After Deposit  : " + a.getBalance());
		
		a.withDraw(12000);
		
		System.out.println("Balance After Withdraw : " + a.getBalance());
	}

}
