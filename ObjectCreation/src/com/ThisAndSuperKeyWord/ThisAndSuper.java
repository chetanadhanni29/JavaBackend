package com.ThisAndSuperKeyWord;

class Database {
	int numBooks;
	Database(int numBooks){
		this.numBooks = numBooks;
	}
}

class Library extends Database{
	String bookName;
	String author;
	int price;
	String dateOfBorrow;
	String dateOfReturn;
	
	Library(String bookName, String author, int price){
		this(bookName, author, price, "01/10/2025", "21/03/2026");	
	}
	
	Library(String bookName, String author, int price, String dateOfBorrow, String dateOfReturn){
		super(500);
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.dateOfBorrow = dateOfBorrow;
		this.dateOfReturn = dateOfReturn;	
		System.out.println(numBooks);
		System.out.println(bookName);
		System.out.println(author);
		System.out.println(price);
		System.out.println(dateOfBorrow);
		System.out.println(dateOfReturn);	
	}
}

public class ThisAndSuper {
	
	public static void main(String[] args) {
		Database db = new Database(100);
		Library lib = new Library("Java", "James", 10000);
		
		System.out.println(lib);
		System.out.println(db);
	}
}
