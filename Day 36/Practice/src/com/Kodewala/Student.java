package com.Kodewala;

public class Student {
	String name;
    String rollNo;
    int marks;
     public Student(String name, String rollNo, int marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

       
       
	 public Student(String name, String rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		
	}
	 
     
     void viewStudent() {
    	 System.out.println(name);
    	 System.out.println(rollNo);
     }
}


