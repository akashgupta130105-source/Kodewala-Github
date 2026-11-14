//You are building a payment module for an e-commerce backend. The system must support UPI, Credit Card, and Net Banking. Each payment method validates and processes the payment differently, but every payment follows the same flow:
//
//Validate the payment details
//Process the payment
//Print a receipt (same for all methods)



package com.BAnk;

public abstract class Payment {
	public final void makePayment(double amount) {
		validate();
		process(amount);
		printReceipt(amount);
	}
	private void validate() {
	} 
	private  void process(double amount) {
	}
	
	private void printReceipt(double amount) {
		System.out.println("Receipt: Rs"+ amount +"Paid succussful");
		
	}
}
	 
	
	
	
	class UpiPayment extends Payment{
		private void validate() {
			System.out.println("Validating Upi ID...");
		}
		private void process(double amount) {
		    System.out.println("Processing Rs."+amount+"Via UPI");
		}
	}
	class CreditCardPayment extends Payment{
		private void vlaidate() {
			System.out.println("Validating card number and Cvv...");
		}
		private void process(double amount) {
			System.out.println("Processing Rs"+ amount+ "Via credit card");
		}
	}
	
	class NetBankingPayment extends Payment{
		private void validate() {
			System.out.println("Validating bank credentials..");
		}
		private void process(double amount) {
			System.out.println("Processing Rs" + amount +"via net banking");
		}
	}
	
	
	


