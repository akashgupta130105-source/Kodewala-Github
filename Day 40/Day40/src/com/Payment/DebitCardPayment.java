package com.Payment;

public class DebitCardPayment implements IPayment {

	@Override
	public void pay(double amount) {
		System.out.println("Debit Card PAyment Successful Rs: "+ amount);
		
	}

}
