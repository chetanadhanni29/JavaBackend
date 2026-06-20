package com.PolymorphismPayment;

public class Driver {

	public static void main(String[] args) {
		PaymentProcess payment = new PaymentProcess();
		
		Payment pay = new Payment();
		payment.doPayment(pay);
		
		PhonePay phonePay = new PhonePay();
		payment.doPayment(phonePay);
		
		GPay gp = new GPay();
		payment.doPayment(gp);
		
		AirtelPayment ap = new AirtelPayment();
		payment.doPayment(ap);
		
	}

}
