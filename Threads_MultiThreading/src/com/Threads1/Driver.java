package com.Threads1;

class MyThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyThread.run() : " + i + " " + Thread.currentThread().getName());
		}
	}
}

public class Driver {

	public static void main(String[] args) {
		MyThread1 t0 = new MyThread1();
		t0.start();

		MyThread1 t1 = new MyThread1();
		t1.start();

	}

}
