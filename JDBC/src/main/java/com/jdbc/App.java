package com.jdbc;

/**
 * Hello world!
 *
 */

import java.sql.SQLException;

public class App {
	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService();
		try {
			 paymentService.getAllPayments("paid");
			paymentService.updatePaymentStatus(102, "on-hold");
			System.err.println();

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}
}