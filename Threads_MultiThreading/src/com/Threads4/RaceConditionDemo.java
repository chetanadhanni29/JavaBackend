package com.Threads4;

class BankAccount {
	private static int balance = 1000;

	public static void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " some other logic..... 50 lines....");

		synchronized (BankAccount.class) {

			if (balance >= amount) {
				System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);

				// Simulate delay
				try {
					Thread.sleep(5000); // it will hold the lock and moves to waiting state
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				balance = balance - amount;
				System.out.println(Thread.currentThread().getName() + " completed withdrawal. Balance = " + balance);
			} else {
				System.out.println(Thread.currentThread().getName() + " Insufficient Balance");
			}

		}
	}

	public int getBalance() {
		return balance;
	}
}

class Customer extends Thread {
	private BankAccount account;

	public Customer(BankAccount account, String name) {
		super(name);
		this.account = account;
	}

	@Override
	public void run() {
			BankAccount.withdraw(800);
	}
}

public class RaceConditionDemo {
	public static void main(String[] args) throws Exception {
		BankAccount account = new BankAccount(); // shared account belongs to Raunak
		System.out.println("Raunak's Init Balance = " + account.getBalance());

		Customer t1 = new Customer(account, "Raunak is doing PhonePay");
		Customer t2 = new Customer(account, "Raunak's Brother is doing Gpay");

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Final Balance = " + account.getBalance());
	}
}