package com.Constructor;

class Payment{
	int amt;
	String txNote;
	String bankName;
	
	public Payment() {
		System.out.println("No parameterized constructor");
	}
	
	public Payment(int amt, String txNote) {
		System.out.println("Calling Two Parameterized constructor");
		this.amt = amt;
		this.txNote = txNote;
	}
	
	public Payment(int amt, String txNote, String bankName) {
		System.out.println("Calling Three Parameterized constructor");
		this.amt = amt;
		this.txNote = txNote;
		this.bankName = bankName;
	}
	
}

public class ConstructorPayment {

	public static void main(String[] args) {
		Payment p0 = new Payment();
		System.out.println("p0 No parameterized constructor : " + p0.amt);
		System.out.println("p0 No parameterized constructor : " + p0.txNote);
		System.out.println();
		
		Payment p1 = new Payment(5000, "Phone Bill");
		System.out.println("p1 Two Parameterized constructor : " + p1.amt);
		System.out.println("p1 Two Parameterized constructor : " + p1.txNote);
		System.out.println();
		
		Payment p2 = new Payment(5000, "Phone Bill", "SBI Bank");
		System.out.println("p1 Three Parameterized constructor : " + p2.amt);
		System.out.println("p1 Three Parameterized constructor : " + p2.txNote);
		System.out.println("p1 Three Parameterized constructor : " + p2.bankName);
	}

}
