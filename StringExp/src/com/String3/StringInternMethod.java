package com.String3;

final class Database {
	final int numBooks = 100;
	int bookName;
	int price;
	
//	numBooks = 200;
		
}

public class StringInternMethod{

	public static void main(String[] args) {
		String s1 = "AMC" + " Engineering";
		String s2 = "AMC";
		String s3 = " Engineering";
		String s4 = s2 + s3;
		String s5 = s4.intern();
		System.out.println(s4 == s5);
		System.out.println(s4 == s1);
		System.out.println(s1 == s5);
		
		
	}

}
