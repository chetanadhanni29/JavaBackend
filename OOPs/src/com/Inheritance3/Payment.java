package com.Inheritance3;

public class Payment extends Bank {
	public void paymentApp(String pay, int price) {
		
		if(pay.equals("PhonePay")) {
			System.out.println("Redirecting to PhonePay");
			paymentProcess(pay, price);
		} else if(pay.equals("GPay")) {
			System.out.println("Redirecting to GPay");
			paymentProcess(pay, price);
		} else if(pay.equals("CreditCard")) {
			System.out.println("Redirecting to CreditCard");
			paymentProcess(pay, price);
		}else if(pay.equals("NetBanking")) {
			System.out.println("Redirecting to NetBanking");
			paymentProcess(pay, price);
		}
	}
}
