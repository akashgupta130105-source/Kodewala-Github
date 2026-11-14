package com.Kodewala;

public class Calculation {
	public static void main(String [] args) {
		FundTrnasfer1 cal = new FundTrnasfer1();
		cal.txnFund(-1000);
		System.out.println(cal.getBalance());
	}

}
