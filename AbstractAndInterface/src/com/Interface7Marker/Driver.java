package com.Interface7Marker;

class Account implements DataPrintable {
	int balance;
	String accountNo;
	String atmPin;
	
	public Account(int balance,	String accountNo, String atmPin) {
		super();
		this.balance = balance;
		this.accountNo = accountNo;
		this.atmPin = atmPin;
	}
}

class DataProcessor {
	public void printDetails(Object obj) {
		if (obj instanceof DataPrintable) { // it will be true if Account class implements DataPrintable()
			Account acc = (Account) obj;
			System.out.println(acc.accountNo);
			System.out.println(acc.atmPin);
			System.out.println(acc.balance);
		} else {
			System.err.println("DataNotPrintableException..");
		}
	}
}

public class Driver {
	public static void main(String[] args) {
		Account acc = new Account(1000, "1234567890", "1234");
		
		DataProcessor dataProcessor = new DataProcessor();
		dataProcessor.printDetails(acc);
	}
}
