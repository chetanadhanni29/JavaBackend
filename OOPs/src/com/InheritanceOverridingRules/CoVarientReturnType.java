package com.InheritanceOverridingRules;

class ArtificalInteligence {
	public ArtificalInteligence (String algorithm, String prog){
		System.out.println("ArtificalInteligence Constructor");
	}
}

class MachineLearning extends ArtificalInteligence{
	
	public MachineLearning (String algorithm, String prog){
		super(algorithm,prog);
		System.out.println("MachineLearning Constructor");
		
	}
}

public class CoVarientReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}