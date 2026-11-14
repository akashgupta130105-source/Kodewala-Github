package com.Kodwala;

public interface IPaymentMathod {
	
	public abstract boolean pay(double amount);
	public abstract String  paymentType(String payment);
	 default double printReceipt(double amount) {
		return amount;
		 
		 
	 }

}
