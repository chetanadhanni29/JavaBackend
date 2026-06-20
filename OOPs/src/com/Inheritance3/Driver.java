package com.Inheritance3;

import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		Notification notify = new Notification();
		Payment pay = new Payment();
		Order order = new Order();
		Bank bank = new Bank();
		Scanner scan = new Scanner(System.in);
		
		order.addCart("Mobile", 19000, 2);
		order.addCart("Dress", 1500, 5);
		order.addCart(null, 0, 0);
		order.addCart("Tab", 15000, 1);
		int price = order.addCart("Laptop", 150000, 2);
		
		System.out.println("Enter Payment Method name you wish to use, PhonePay, GPay, CreditCard, NetBanking");
		String paymentName = scan.next();
		
		System.out.println("Enter ID and Password");
		String id = scan.next();
		String pass = scan.next();	
		bank.connectToBank(id,pass);
		pay.paymentApp(paymentName, price);
		
		
	}

}
