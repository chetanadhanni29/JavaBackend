package com.MethodOverloading;

class Student {
	public void studentDetails(String name, int age) {
		System.out.println("studentDetails - " + name + " " + age);
	}
	
	public void studentDetails(String address, int num, int marks) {
		System.out.println("studentDetails - " + address + " " + num + " " + marks);
	}
	
	public void studentDetails(String clgName, String branch, String dept) {
		System.out.println("studentDetails - " + clgName + " " + branch + " " + dept);
	}
}

public class MethodOverloadingExp {

	public static void main(String[] args) {
		Student s = new Student();
		s.studentDetails("Gowthu", 26);
		s.studentDetails("BTM", 68, 90);
		s.studentDetails("Kodewala", "Computer Science", "CSE");
		
	}

}
