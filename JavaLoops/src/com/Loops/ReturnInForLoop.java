package com.Loops;

public class ReturnInForLoop {

	public static void main(String[] args) {
		System.out.println("Main started");
		ReturnInForLoop ra = new ReturnInForLoop();
		ra.returnLoop();
		System.out.println("Main ended");

	}
	public void returnLoop() {
		int arr[] = {1, 2, 3, 4, 5, 6 ,7 , 8, 9, 10};
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 5) {
				return;
			}
			System.out.println(arr[i]);
		}
	}

}