package com.Inheritance2;

public class Submit extends Notification{
	public void uploaded(String upload) {
		if(upload.equals("yes")) {
			sendEmail();
			sendSMS();
		} else {
			System.out.println("Please upload the documents to processed futher");
		}
	}
}