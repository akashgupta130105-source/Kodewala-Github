package com.MyMarker;

public class Main1 {
	public static void main(String []args) throws CloneNotSupportedException {
		Employee1 emp = new Employee1("37484","Akash");
		Employee1 emp1=(Employee1)emp.clone();
		System.out.println(emp1.id);
	}

}
