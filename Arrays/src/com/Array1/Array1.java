package com.Array1;

import java.util.Scanner;

class Library{
	
	public void book() {
		String book[] = new String[5];
		book[0] = "Java";
		book[1] = "Python";
		book[2] = "Go";
		book[3] = "Rust";
		book[4] = "JavaScript";
		
		for(int i = 0; i < book.length; i++) {
			System.out.println(book[i]);
		}
	}	
	
	public void book(String[] book1) {	
		for(int i = 0; i < book1.length; i++) {
			System.out.println(book1[i]);
		}
	}	
}

public class Array1 {

	public static void main(String[] args) {
		
		Library li = new Library();
//		li.book();

		Scanner scan = new Scanner(System.in);
		String book1[] = new String[5];
		for(int i = 0; i < book1.length; i++) {
			book1[i] = scan.next();
		}
		li.book(book1);
	}

}
