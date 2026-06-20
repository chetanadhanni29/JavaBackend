package com.String1;

public class DriverString {

	public static void main(String[] args) {
		
		String s1 = "Karnataka";
		String s2 = "Karnataka";
		String s3 = new String("Karnataka");
		String s4 = new String("Karnataka");
		String s5 = new String("Bangalore");
		String s6 = "karnataka";
		System.out.println("s1 == s2      : " + (s1 == s2));
		System.out.println("s1 == s3      : " + (s1 == s3));
		System.out.println("s3 == s4      : " + (s3 == s4));
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s2.equals(s4) : " + s2.equals(s4));
		System.out.println("s4.equals(s5) : " + s4.equals(s5));	
		System.out.println("s6.equalsIgnoreCase(s4) : " + s6.equalsIgnoreCase(s4));

	}
}
