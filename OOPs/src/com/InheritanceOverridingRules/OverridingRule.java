package com.InheritanceOverridingRules;

class CargoPlane {
	void flyPlane(String planeName) {
		System.out.println("Action fly from CargoPlane Parent class");
	}
}

class FighterPlane extends CargoPlane {
	@Override
	protected void flyPlane(String planeName) {
		System.out.println("Action fly from FighterPlane Child class");
	}
}

public class OverridingRule {

	public static void main(String[] args) {
		CargoPlane p = new CargoPlane();
		FighterPlane u = new FighterPlane();
		p.flyPlane(null);
		u.flyPlane(null);
	}

}
