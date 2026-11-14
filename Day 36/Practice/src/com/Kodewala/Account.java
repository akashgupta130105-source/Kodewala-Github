package com.Kodewala;

public class Account {
	private int balance;
	public void credit()
	{
		checkBalance();
		validatePin("tghf43");
		System.out.println("Account.credit()..doing fund transfer");
		}
	private int checkBalance() {
		System.out.println("Account.checkBalance()");
		return 2000;
	}
	private boolean validatePin(String UserId) {
		System.out.println("Account.validatePin()....");
		return true;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

}
