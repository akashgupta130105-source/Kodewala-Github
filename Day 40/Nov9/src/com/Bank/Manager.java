package com.Bank;

public class Manager extends Employee{

	public Manager(String employeeID, String employeeName, int salary, String department) {
		super(employeeID, employeeName, salary, department);
		
	}
	public void manage() {
		System.out.println("Manger.manage()");
		
	}
	@Override
	public void work() {
		System.out.println("Manager.work()");
	}

}
