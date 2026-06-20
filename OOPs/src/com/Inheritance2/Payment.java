package com.Inheritance2;

public class Payment extends Notification {
	public void payment(int pay) {
		if(pay == 10000) {
			sendEmailPay();
			sendSMSPay();
		} else {
			System.out.println("Please make payment to processed futher");
		}
	}
}