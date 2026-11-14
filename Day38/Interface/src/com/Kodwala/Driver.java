package com.Kodwala;

public class Driver {
	public static void main(String []args) {
		IDiscount idscount= new FlightBooking();
		int result =idscount.calculateDiscount(2000, 10);
		System.out.println(result);
	}

}
