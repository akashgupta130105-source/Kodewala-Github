package com.Kodwala;

public class Credit implements IPayment{

	@Override
	public double doCredit(double balance,double amount) {
          double finalBalance = balance + amount;
		return finalBalance;
	}

	@Override
	public double doDebit(double balance,double amount ) {
		double finalBalance = balance - amount; 
		
		return finalBalance;
	}
       

}
