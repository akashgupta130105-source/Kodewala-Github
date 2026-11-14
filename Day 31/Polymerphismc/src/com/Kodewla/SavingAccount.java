package com.Kodewla;

public class SavingAccount extends Accounts {
	double earnInterst;

	public SavingAccount(String accountNumber, String holderName, int balance, int deposite, int withdraw,
			double earnInterst) {
		super(accountNumber, holderName, balance, deposite, withdraw);
		this.earnInterst = earnInterst;
		
		
	}

	
	}

}
