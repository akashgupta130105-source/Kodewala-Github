package com.Clone;

public class Main1 {
	public static void main(String []args) throws CloneNotSupportedException {
		Employee1 emp = new Employee1("9876","Akash",6000); 
		Employee1 emp1= (Employee1)emp.clone();
		System.out.println(emp1.id);
//		System.out.println(emp.id);
	}

}
