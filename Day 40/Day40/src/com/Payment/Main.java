package com.Payment;

public class Main {
	public static void main(String []args) {
		PaymentProcessor paymentProcessor=new PaymentProcessor();
		paymentProcessor.paymentOfProcessor(new UPIPayment());
	}

}
