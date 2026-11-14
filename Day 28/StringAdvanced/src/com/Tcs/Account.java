package com.Tcs;

class AccountMgmt<pubic>{
	 public AccountMgmt(){
	System.out.println("AccountMgmt.AccountMgmt()...");
	
	}
}

public class Account  extends AccountMgmt {
	String accountNumber;
	{
		System.out.println("Account IIB");
	}
	public Account(String accountNumber) {
		super();
		System.out.println("Account(String accountNumber)");
		this.accountNumber =accountNumber;
	}

}
