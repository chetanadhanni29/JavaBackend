package com.Inheritance2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Notification n = new Notification();
		Submit s = new Submit();
		Payment p = new Payment();
		Scanner scan = new Scanner(System.in);
		String upload = scan.next();
		s.uploaded(upload);
		int pay = scan.nextInt();
		p.payment(pay);

	}

}
