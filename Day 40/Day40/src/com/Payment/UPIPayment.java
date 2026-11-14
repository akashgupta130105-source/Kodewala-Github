package com.Payment;

public class UPIPayment implements IPayment{

	@Override
	public void pay(double amount) {
		System.out.println("UPI Payment Successful :Rs "+amount);
		
	}

}
