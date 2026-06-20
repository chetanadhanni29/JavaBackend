package com.Inheritance3;

public class Notification{
	
	public void OrderSMS(int amount) {
		System.out.println("Order Successful Placed of total price " + amount);
	}
	
	public void sendSMSPhonePay(int amount) {
		System.out.println("Payment Successful of the amount " + amount + " using PhonePay");
	}
	
	public void sendSMSGPay(int amount) {
		System.out.println("Payment Successful of the amount " + amount + " using GPay");
	}
	
	public void sendSMSCreditCard(int amount) {
		System.out.println("Payment Successful of the amount " + amount + " using CreditCard");
	}
	public void sendSMSNetBanking(int amount) {
		System.out.println("Payment Successful of the amount " + amount + " using NetBanking");
	}

}
