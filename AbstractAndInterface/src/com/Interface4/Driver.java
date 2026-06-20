package com.Interface4;

interface IEComSystem {
	void placeOrder();
	void cancelOrder();
	void editOrder();
	default void generateInvoice() {
		// 500 + send sms
		sendSms();
	}
	public static void printInvoicePDF() { // Common functionality
		connectServer(); // --> init print --> write to file -->
		notifyCustomer();
	}
	
	public static void sendNotification () { // Common functionality
		connectServer(); // --> draft email -->
		notifyCustomer();
	}
	
	private static void connectServer () {
		// 50 lines
	}
	
	private static void notifyCustomer () {
		// 50 lines
	}
	
	private void sendSms() {
		// 50 lines
	}
}

class Amazon implements IEComSystem{

	@Override
	public void placeOrder() {
		System.out.println("Amazon.placeOrder()");
	}

	@Override
	public void cancelOrder() {
		System.out.println("Amazon.cancelOrder()");
	}

	@Override
	public void editOrder() {
		System.out.println("Amazon.editOrder()");
	}

	@Override
	public void generateInvoice() {
		System.out.println("Amazon.generateInvoice()");
		printInvoicePDF("path to store pdf file", "seller logo");
	}
	private void printInvoicePDF(String path, String companyLogo) {
		IEComSystem.printInvoicePDF();
	}
}

class Flipkart implements IEComSystem{

	@Override
	public void placeOrder() {
		System.out.println("Flipkart.placeOrder()");
	}

	@Override
	public void cancelOrder() {
		System.out.println("Flipkart.cancelOrder()");
	}

	@Override
	public void editOrder() {
		System.out.println("Flipkart.editOrder()");
	}

	@Override
	public void generateInvoice() {
		System.out.println("Flipkart.generateInvoice()");
		printInvoicePDF("path to store pdf file", "seller logo");
	}
	
	private void printInvoicePDF(String path, String companyLogo) {
		IEComSystem.printInvoicePDF();
	}
}

public class Driver {

	public static void main(String[] args) {
		
	}

}
