package com.amazon.constructor;

public class Employee {
	String name;
	int id;
	//Constructor
	public Employee(String name, int id ) {
		this.name = name;
		this.id = id;
		
	}
	public static void main(String[] args) {
		Employee emp1 = new Employee("Akash",101);
		System.out.println(emp1.name + " "+emp1.id);
	}

}
