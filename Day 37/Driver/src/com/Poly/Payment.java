package com.Poly;

public class Payment {
//	public Payment(String name, String address, double balance) {
//		super();
//		this.name = name;
//		this.address = address;
//		this.balance = balance;
//	}
//
//	String name;
//	String address;
//	double balance;
	public boolean pay(String name ,String address, double balance) {
		checkAccount();
		validateNameandAddress(name,address);
		checkBalance();
		
			return true;
		}
	private void checkAccount() {
		System.out.println("Payment.checkAccount()");
	}
	
	private void validateNameandAddress(String name,String address) {
		System.out.println("Payment.validateNameandAddress()");
		
	}
	
	private void checkBalance() {
		System.out.println("Payment.checkBalance()");
	}
	}


