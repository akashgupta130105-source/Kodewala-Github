package com.MyMarker;

public class Main {
	public static void main (String []args) {
		Employee emp = new Employee(101, "Akash");
		if(emp instanceof Employee) {
			System.out.println("Employee has a marker capbility");
			
		}
	}
	

}
