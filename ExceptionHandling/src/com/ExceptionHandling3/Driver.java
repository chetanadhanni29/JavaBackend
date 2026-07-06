package com.ExceptionHandling3;

public class Driver {

	public static void main(String[] args) {

		String name = "";

		System.out.println(name.length()); // NPE --> Unchecked / RunTime Exception

		// checked exception
		try {
			Class.forName("com.kodewala.Driver");
			// load or read file --> FileNotFoundException
			// SQLException
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // forcing to handle it coz ClassNotFoundException is checked exception

	}

}