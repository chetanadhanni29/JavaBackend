package com.Inheritance3;

import java.util.Scanner;

public class Bank extends Notification {
	static String id = "chetana@gmail.com";
	static String pass = "chetana";	 	
	static int pin = 123456;
	public void connectToBank(String id1, String pass1) {
		if(id.equals(id1) && pass.equals(pass1)) {
			System.out.println("Connected to the Bank");
		} else {
			System.out.println("Invalid ID or Password");
		}
	}
	
	public void paymentProcess(String pay, int price) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Amount you need to Pay");
		int amount = scan.nextInt();
		if(amount == price) {
			System.out.println("Enter the PIN");
			int userPin = scan.nextInt();
			if(pin == userPin && amount > 0) {		
				if(pay.equals("PhonePay")) {
					sendSMSPhonePay(amount);
				} else if(pay.equals("GPay")) {
					sendSMSPhonePay(amount);
				} else if(pay.equals("CreditCard")) {
					sendSMSPhonePay(amount);
				} else if(pay.equals("NetBanking")) {
					sendSMSPhonePay(amount);
				}
				
			} else {
				System.out.println("Entered wrong PIN or entered invalid amount, try again!!!");
			}
			
		}
		
		
	}
}
