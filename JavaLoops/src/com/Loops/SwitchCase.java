package com.Loops;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String custType = scan.next();
		
		switch(custType) {
			case "Gold":
				System.out.println("10 % discount");
				break;
			case "Silver":
				System.out.println("No discount");
				break;
			case "Platinum":
				System.out.println("15 % discount");
				break;
			default:
				System.out.println("Invalid Type");
				break;
		}	
		scan.close();
	}
}