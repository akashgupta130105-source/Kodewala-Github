package com.Payment;

public class Main {
	public static void  main(String []args) {
		ProcessPayment process=new ProcessPayment();
		process.processPayment(new CreditCardPayment());
		process.processPayment(new UPIPayment());
		
	}

}
