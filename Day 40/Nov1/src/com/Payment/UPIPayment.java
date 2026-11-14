package com.Payment;

public class UPIPayment implements IPayment {

	

	@Override
	public double pay(double amount) {
		System.out.println("Paid total amount by UPI payment "+amount );
		return amount;
	}

}
