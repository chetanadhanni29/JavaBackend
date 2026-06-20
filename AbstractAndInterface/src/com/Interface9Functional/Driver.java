package com.Interface9Functional;

public class Driver {

	public static void main(String[] args) {
//		ICalc calc = (i) -> i*i;   //(Math.sqrt(i));
//		
////		ICalc calc = (i,j) -> { 
////			int sum = i+j;
////			return sum;
////		};
//		
//		int sum = calc.doCalc(16);
//		System.out.println(sum);
		
		IStringToUppercase up = (str) -> str.toUpperCase();
		String s = up.convertUpper("chetana");
		System.out.println(s);
		
	}
	
}
