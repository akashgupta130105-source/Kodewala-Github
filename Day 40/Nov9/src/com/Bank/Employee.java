package com.Bank;

public class Employee {
	 String employeeID;
	 String employeeName;
	 int salary;
	 String department;
	public Employee(String employeeID, String employeeName, int salary, String department) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;
	}
    public void work() {
    	System.out.println("Employee.work()");
    }
}
