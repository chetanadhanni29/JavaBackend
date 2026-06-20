package com.Interface3;

// 2010(1.6) --> 2012(wanted new feature 'printPassBook')
interface IBanking {
	void pay(); //2010
	void settle(); //2010
	void cancelTxn(); //2010
	
	default void printPassBook() { // Only rural bank need this (2012)
		System.out.println("IBanking.printPassBook() - default functionality");
	}
}

class HDFC implements IBanking {

	@Override
	public void pay() {
		System.out.println("HDFC.pay()");
	}

	@Override
	public void settle() {
		System.out.println("HDFC.settle()");
	}

	@Override
	public void cancelTxn() {
		System.out.println("HDFC.cancelTxn()");
	}
	
}

class PNB implements IBanking {

	@Override
	public void pay() {
		System.out.println("PNB.pay()");
	}

	@Override
	public void settle() {
		System.out.println("PNB.settle()");
	}

	@Override
	public void cancelTxn() {
		System.out.println("PNB.cancelTxn()");
	}
	
}
// 20+ national bank...

class RuralBank implements IBanking {

	@Override
	public void pay() {
		System.out.println("RuralBank.pay()");
	}

	@Override
	public void settle() {
		System.out.println("RuralBank.settle()");
	}

	@Override
	public void cancelTxn() {
		System.out.println("RuralBank.cancelTxn()");
	}
	
	public void printPassBook() {
		System.out.println("RuralBank.printPassBook()");
	}
	
}

public class Driver {

	public static void main(String[] args) {
		
	}

}
