package com.Kodewala;

public class Main2 {
	public static void main(String []args) {
		Payment1 payment=(double amount)->{
			System.out.println("This is amount to be paid"+amount);
		};
		payment.pay(4000);
	}

}
