package com.tcs;

public class EmployeePayRoll {
	int id;
	String name;
	int salary;
	String department;

	public EmployeePayRoll() {
		

	}

	public EmployeePayRoll(int _id, String _name,int _salary,  String _department) {
		if (_salary < 0) {
			System.out.println("salary must be grater than 0");
		}
		
		this.id = _id;
		this.name = _name;
		 this.salary = _salary;
		this.department = _department;

	}

	public static void balance(int salary) {
	
	}

}
