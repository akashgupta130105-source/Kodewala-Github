package com.Kodwala;

public class FlightBooking implements IDiscount{
	
	public int calculateDiscount(int amount,int rate) {
		int finalfare=amount-(amount*rate)/100;
		return finalfare;
	}
	
	

	@Override
	public void calculateDiscountTax(int tax) {
		System.out.println("FlightBooking.calculateDiscoountTax()");
		
	}
	

}
