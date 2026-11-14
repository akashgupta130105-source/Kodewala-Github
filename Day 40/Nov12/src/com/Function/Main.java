package com.Function;

public class Main {
	public static void main(String []args) {
		IPayment p=()->{
			System.out.println("Payment successful");
		};
		p.pay();
	}

}
