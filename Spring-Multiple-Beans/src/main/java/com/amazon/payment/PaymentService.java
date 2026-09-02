package com.amazon.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// POJO Class - Annotation bean creation
@Component 
public class PaymentService {

	@Autowired // Field injection
	@Qualifier("card")
	Payment payment;

	public void doPayment() {
		payment.pay();
	}

}
