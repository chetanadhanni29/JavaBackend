package com.Interface9Functional;

public interface IPayment { // Functional Interface
	void pay();
}

@FunctionalInterface
interface IRefund extends IPayment {
//	void settle(); // + pay()
}