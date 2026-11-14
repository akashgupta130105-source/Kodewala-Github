package com.Kodwala;

public class Main {
	public static void main(String []args) {
		IPayment iPayment = new Credit();
		double result=iPayment.doDebit(300,30);
		System.out.println(result);
		IPayment iPayment1= new Credit();
		double result1 =iPayment1.doCredit(2000, 3000);
		System.out.println(result1);
		IPayment iPayment2= new Credit();
		double result2=iPayment2.totalNetWorth(6000, 6000);
		System.out.println(result2);
		
	}

}
