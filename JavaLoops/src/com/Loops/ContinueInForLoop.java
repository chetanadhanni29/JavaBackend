package com.Loops;

public class ContinueInForLoop {

	public static void main(String[] args) {
		System.out.println("Main started");
		ContinueInForLoop ca = new ContinueInForLoop();
		ca.continueLoop();
		System.out.println("Main ended");

	}
	
	public void continueLoop() {
		int arr[] = {1, 2, 3, 4, 5, 6 ,7 , 8, 9, 10};
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 3 || arr[i] == 6) {
				continue;
			}
			System.out.println(arr[i]);
		}
		
	}

}