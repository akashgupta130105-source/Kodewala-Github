package com.tcs;

public class Pyment {
	public static void main(String[] args) {
		EmployeePayRoll e = new EmployeePayRoll(101, "Bikash", 7000, "RPA");
		System.out.println(e.id + " and " + e.name + " and " + e.salary + " and " + e.department);

		EmployeePayRoll e1 = new EmployeePayRoll(102, "Akash", -7000, "SDE");
		System.out.println(e1.id + " and " + e1.name + " and " + e1.salary + " and " + e1.department);
	}

}