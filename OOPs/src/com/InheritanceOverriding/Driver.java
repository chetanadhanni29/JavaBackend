package com.InheritanceOverriding;

class HospitalDatabase {
	String medicineName;
	int price;
	String brand;
	public void medicine(String medicineName, int price, String brand) {
		System.out.println(medicineName);
		System.out.println(price);
		System.out.println(brand);
 	}
}

class MedicineDetails extends HospitalDatabase{
	public void medicine(String medicineName, int price, String brand) {
		medicineName = "Livogen";
		System.out.println(medicineName);
		System.out.println(price);
		System.out.println(brand);
		
	}
	
}

public class Driver {

	public static void main(String[] args) {
		HospitalDatabase hd = new HospitalDatabase();
		MedicineDetails md = new MedicineDetails();
		hd.medicine("VitaminD", 1000, "Cipla");
		md.medicine("Calcium", 1000, "SomeBrand");

	}

}
