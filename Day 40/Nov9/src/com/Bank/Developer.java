package com.Bank;

public class Developer extends Employee{

	public Developer(String employeeID, String employeeName, int salary, String department) {
		super(employeeID, employeeName, salary, department);
		// TODO Auto-generated constructor stub
	}
	public void coding() {
		System.out.println("Developer.coding()");
	}
	@Override
	public void work() {
		System.out.println("Developer.work()");
	}

}
