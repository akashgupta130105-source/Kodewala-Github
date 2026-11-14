package com.Kodwala;

public class BusBooking implements IDiscount{
     
	@Override
	public int calculateDiscount(int amount, int rate) {
	    System.out.println("BusBooking.calculateDiscount()");
		return 0;
	}

	@Override
	public void calculateDiscountTax(int tax) {
		
		System.out.println("BusBooking.calculateDiscoountTax()");
	}
	

}
