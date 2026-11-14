package com.Bank;

public class UPIPayments implements IPayment{

	@Override
	public boolean pay(double amount) {
		System.out.println("UPIPayments.pay()");
		return true;
	}
	

}
