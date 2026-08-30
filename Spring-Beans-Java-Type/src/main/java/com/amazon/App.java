package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.account.beans.Account;
import com.amazon.account.beans.Payment;
import com.amazon.account.config.SpringConfig;
import com.amazon.account.config.SpringConfigAnnotation;

class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

}

public class App {
	public static void main(String[] args) {
		// Java Type
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Account acc = (Account) context.getBean("acc1");

		acc.displayAccountInfo();
		
		// Annotation Type
		ApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfigAnnotation.class);

		Payment pay = (Payment) context1.getBean(Payment.class);

		pay.showPayment();

		Person p = new Person("Kodewala");

	}
}