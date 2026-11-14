package com.Kodewala;



public class Driver {
	public static void main(String [] args) {
	Payment pay = new Payment(1000);
	pay.doCredit(200);
	
	
	System.out.println(pay.getBalance());
	
	
	
	}
}
