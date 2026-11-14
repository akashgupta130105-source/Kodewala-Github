package com.Bank;

public class DebitCard implements IPayment {

	@Override
	public boolean pay(double amount) {
		System.out.println("DebitCard.pay()");
		return true;
	}
	

}
