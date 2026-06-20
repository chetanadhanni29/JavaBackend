package com.InheritanceOverridingRules;

class HomePage {
	public ArtificalInteligence home(String algorithm, String prog){
		System.out.println("ArtificalInteligence Constructor");
		return new ArtificalInteligence("SVM", "KNN");
	}
}

class Dashboard extends HomePage{
	@Override
	public MachineLearning home(String algorithm, String prog){
		System.out.println("MachineLearning Constructor");
		return new MachineLearning("SVM", "KNN");
	}
}

public class CoVarientReturnTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}