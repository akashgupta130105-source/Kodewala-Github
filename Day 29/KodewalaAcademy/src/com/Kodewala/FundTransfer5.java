package com.Kodewala;

public class FundTransfer5 {
	public static  void main(String [] args) {
		Fund fun = new Fund("Akash","987654321",90000,"Akash");
		fun.txnAmount(5000);
		System.out.println(fun.getBalance());
		
	}

}
