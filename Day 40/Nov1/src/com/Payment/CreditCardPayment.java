package com.Payment;

public class CreditCardPayment implements IPayment{
	

	

	@Override
	public double pay(double amount) {
		System.out.println("Paid total amount by Credit card "+amount);
		return amount;
		
	}

}
