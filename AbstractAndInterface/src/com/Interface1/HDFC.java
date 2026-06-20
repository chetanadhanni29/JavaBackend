package com.Interface1;

public class HDFC implements IBanking{

	@Override
	public void pay() {
		System.out.println("HDFC.pay()");
	}

	@Override
	public void settle() {
		System.out.println("HDFC.settle()");
	}

	@Override
	public void addPayee() {
		System.out.println("HDFC.addPayee()");
	}

	@Override
	public void modifyPayee() {
		System.out.println("HDFC.modifyPayee()");
	}

	@Override
	public void doEKYC() {
		System.out.println("HDFC.doEKYC()");
	}

}
