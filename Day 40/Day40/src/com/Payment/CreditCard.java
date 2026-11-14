package com.Payment;

public class CreditCard implements IPayment{

	@Override
	public void pay(double amount) {
		System.out.println("Credit card payment successful Rs "+amount);
		
	}

}
