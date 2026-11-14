package com.Kodewala;

public class Student {
	String name;
	int rollNumber;
	int marks;
	public Student(String name, int rollNumber, int marks) {
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
