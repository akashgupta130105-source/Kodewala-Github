package com.Kodewala;

public class Payment {
	private int balance;

	public Payment(int balance) {
		super();
		this.balance = balance;
	}
	public void doCredit(int _amount)
	{
		balance =balance-_amount;
	}
	public void doDebit(int _amount)
	{
		balance =balance+_amount;
	}
	public int getBalance(){
		return balance;
	}
}



