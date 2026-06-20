package com.MethodOverloading;

class Salary {
	int total;
	public int salaryCal(int baseSalary) {
		return baseSalary;
	}
	public int salaryCal(int baseSalary, int bouns) {
		total = baseSalary+bouns;
		return total;
	}
	public int salaryCal(int baseSalary, int bouns, int incentive) {
		total = baseSalary+bouns+incentive;
		return total;
	}
}
public class CalculateSalary {
	public static void main(String[] args) {
		Salary s = new Salary();
		int bs = s.salaryCal(100000);
		int bsb = s.salaryCal(100000,75000);
		int bsbi = s.salaryCal(100000,75000,50000);
		System.out.println("baseSalary : " + bs); 
		System.out.println("baseSalary and bouns : " + bsb);
		System.out.println("baseSalary, bouns and incentive : " + bsbi);

	}

}
