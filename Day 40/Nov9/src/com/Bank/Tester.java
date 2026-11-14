package com.Bank;

public class Tester extends Employee {

	public Tester(String employeeID, String employeeName, int salary, String department) {
		super(employeeID, employeeName, salary, department);
		
	}
	public void testing() {
		System.out.println("Tester.testing()");
	}
	@Override
	public void work() {
		System.out.println("Rahul is a tester()  "+ employeeID+" "+ employeeName+" "+salary+" "+department);
	}

}
