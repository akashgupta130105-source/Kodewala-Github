package com.kodwala;

public class CardPayment implements IPaymentService{

	@Override
	public boolean pay(double amount) {
		System.out.println("CardPayment.pay()");
		return false;
	}

}
