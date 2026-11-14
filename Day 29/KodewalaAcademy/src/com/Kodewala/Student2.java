package com.Kodewala;

public class Student2 {
	private String name;
	private int age;
	
	public Student2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student2() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		if(age >0 && age<120) {
			this.age = age;
		} else {
			System.out.println("Inavalid age");
		}
	}
	
	
	
	

}
