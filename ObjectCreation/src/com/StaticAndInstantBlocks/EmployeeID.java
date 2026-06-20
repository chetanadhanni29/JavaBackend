package com.StaticAndInstantBlocks;

class NewEmployeeID{
	public static int totalNewEmp = 0;
	private String empName;
	
	public NewEmployeeID(String empName) {
		this.empName = empName;
		System.out.println("Emplayee Name : " + empName);
		System.out.println();
	}
	{
		totalNewEmp += 1;
		System.out.println("Employee ID : Kodewala - " + totalNewEmp);
	}
}

public class EmployeeID {

	public static void main(String[] args) {
		NewEmployeeID u1 = new NewEmployeeID("Gowthu");
		NewEmployeeID u2 = new NewEmployeeID("Krish");
		NewEmployeeID u3 = new NewEmployeeID("Anu");
		NewEmployeeID u4 = new NewEmployeeID("Fouziya");
		NewEmployeeID u5 = new NewEmployeeID("Priya");
		NewEmployeeID u6 = new NewEmployeeID("Usha");
		NewEmployeeID u7 = new NewEmployeeID("Arpitha");
		
		System.out.println(" Total New Employee Joined to the company are : " + NewEmployeeID.totalNewEmp);	
		
	}

}