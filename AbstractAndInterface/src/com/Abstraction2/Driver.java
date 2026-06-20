package com.Abstraction2;

abstract class PaymentSystem { // (Abstract) + (Non-Abstract - Method with body)
	public abstract void pay(); //What?
	public abstract void doKYC();
	
	public void stopCheque() { //Concrete Method / Non-Abstract - Method with body
		System.out.println("PaymentSystem.stopCheque()");
	}
	
	PaymentSystem(){
		System.out.println("PaymentSystem.PaymentSystem()");
	}
}

class HDFC extends PaymentSystem{
	@Override
	public void pay() {
		System.out.println("HDFC.pay()"); //How?
	}

	@Override
	public void doKYC() {
		System.out.println("HDFC.doKYC()");
		
	}
}
public class Driver {

	public static void main(String[] args) {
		// PaymentSystem is an abstract class so we can't create object, its compile time error
//		PaymentSystem paymentSystem = new PaymentSystem();
		HDFC hdfc = new HDFC();
		hdfc.pay();
		hdfc.doKYC();
	}

}
