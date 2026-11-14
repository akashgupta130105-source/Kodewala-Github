package com.Kodewala;

public class Student3 {
	private String name;
	private int age;
	public Student3(String name, int age) {
		super();
		setName(name);
		setAge(age);
	}
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<=0 || age >120) {
			throw new IllegalArgumentException("Invalid age" +age);
		}
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		if(name == null || name.isBlank()) {
			throw new IllegalArgumentException("Name annot b empty");
		}
		this.name = name;
	}
	

}
