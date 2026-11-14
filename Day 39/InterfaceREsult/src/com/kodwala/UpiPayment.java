package com.kodwala;

public class UpiPayment implements IPaymentService {

	@Override
	public boolean pay(double amount) {
		System.out.println("UpiPayment.pay()");
		return true;
	}

}
