package com.Pol;

public class Student1 {
	private String name;
	private String rollNo;
	private String marks;
	public Student1(String name, String rollNo, String marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(marks);
		
	}
}
class Driver5{
	public static void main(String [] args) {
		Student  stu = new Student("Akash" ,"20", "90"); 
		stu.display();
		Student  stu1 = new Student("Vikash" ,"20", "90"); 
		stu1.display();
		Student  stu2 = new Student("Prakash" ,"20", "90"); 
		stu2.display();
		
	}
}
