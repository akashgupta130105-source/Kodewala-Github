package com.kodwala;

public class NetBankingPayment implements IPaymentService {

	@Override
	public boolean pay(double amount) {
		System.out.println("NetBankingPayment.pay()");
		return true;
	}
      
}
