package com.Kodewala;

public class Fund {
	public Fund(String accounHolderName, String accountNumber, double balance, String name) {
		super();
		this.accounHolderName = accounHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
	}
	private String accounHolderName;
	private String accountNumber;
	private double balance;
	private String name;
	public String getAccounHolderName() {
		return accounHolderName;
	}
	public void setAccounHolderName(String accounHolderName) {
		this.accounHolderName = accounHolderName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void txnAmount(int _amount) {
		if( _amount<=0 || balance <= _amount  ) {
			throw new IllegalArgumentException("Balance can not be less than amount");
			
	}
		
		balance -=_amount;
	

}
}
