package com.Marker;

public class Main {
	public static void main(String []args) {
		Emoloyee emp= new Emoloyee();
		if(emp instanceof MyMarker) {
			System.out.println("Employee is marked");
		}
	}

}
