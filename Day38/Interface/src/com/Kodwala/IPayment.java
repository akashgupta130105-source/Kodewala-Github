package com.Kodwala;

public interface IPayment {
	public abstract double doCredit(double balance,double amount);
	public abstract double doDebit(double balance,double amount);
	public default double totalNetWorth(double bank1,double bank2) {
		double totalBalance = bank1+bank2;
		return totalBalance;
	}

}
