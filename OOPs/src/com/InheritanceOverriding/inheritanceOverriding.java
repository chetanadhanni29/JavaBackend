package com.InheritanceOverriding;

class PaymentSystem {
	public void pay() {
		System.out.println("Doing Payment");
	}
}

class PhonePay {
	public void pay() {
		System.out.println("Doing PhonePay Payment");
	}
}

class Gpay {
	public void pay() {
		System.out.println("Doing Gpay Payment");
	}
}

public class inheritanceOverriding {

	public static void main(String[] args) {
		PaymentSystem ps = new PaymentSystem();
		PhonePay pp = new PhonePay();
		Gpay gp = new Gpay();
		ps.pay();
		pp.pay();
		gp.pay();

	}

}
