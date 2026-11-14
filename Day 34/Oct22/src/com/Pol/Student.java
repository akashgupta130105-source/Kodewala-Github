package com.Pol;

public class Student {
	String name;
	String rollNumber;
	String marks;
	public Student(String name, String rollNumber, String marks) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(rollNumber);
		System.out.println(marks);
		
	}

	

}
