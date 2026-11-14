package com.Bank;

public class CreditCard implements IPayment {

	

	@Override
	public boolean pay(double amount) {
		System.out.println("CreditCard.pay()  "+amount);
		return true;
	}
	

}
