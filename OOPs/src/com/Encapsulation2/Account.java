package com.Encapsulation2;

public class Account {

	private int balance = 1000000;

	public void deposit(int amount) {
		if(amount > 0) {
			balance += amount;
		} else {
			System.err.println("Invalid Amount !!!");
		}
	}
	
	public void withDraw(int amount) {
		if(amount > 0) {
			balance -= amount;
		} else {
			System.err.println("Invalid Amount !!!");
		}
	}
	
	public int getBalance() {
		return balance;
	}
	
}
