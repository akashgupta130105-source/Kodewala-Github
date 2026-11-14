package com.Kodewala;

public class FundTransfer {
	  private int balance;
	  String accountHolderName;
	  String accountNumber;
	  String name;
	 
	 

	

public FundTransfer(int balance, String accountHolderName, String accountNumber, String name) {
		super();
		this.balance = balance;
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.name = name;
	}
	public FundTransfer(int balance2, String accountHolderName2, String accountNumber2, String name2) {
	// TODO Auto-generated constructor stub
}
	public void Txnamount(int _amount)
	{
		balance =balance-_amount;
	}
	public void Fundamount(int _amount)
	{
		balance =balance+_amount;
	}
	public int getBalance(){
		return balance;
	
}

}
