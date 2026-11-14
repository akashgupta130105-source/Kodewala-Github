package com.Kodewala1;

public class KalyanNagar extends DrDoodly {
	int surgeryFee;

	public KalyanNagar(String name, String type, int age, double weight, int surgeryFee) {
		super(name, type, age, weight);
		this.surgeryFee = surgeryFee;
	}
	
	public void  viewKalyanNagar() {
	     System.out.println(name);
	     System.out.println(type);
	     System.out.println(age);
	     System.out.println(weight);
	     System.out.println(surgeryFee);
	}

	

}
