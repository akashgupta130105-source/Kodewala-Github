package com.Kodewala1;

// parent class

public class DrDoodly {
	String name;
	String type;
	int age;
	double weight;
	public DrDoodly(String name, String type, int age, double weight) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
		this.weight = weight;
	}
	
	 void viewDrDoodly() {
		System.out.println(name);
		System.out.println(type);
		System.out.println(age);
		System.out.println(weight);
	}

}
