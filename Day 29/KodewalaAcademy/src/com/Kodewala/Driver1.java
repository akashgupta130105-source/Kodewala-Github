package com.Kodewala;

public class Driver1 {
	public static void main(String []args) {
		
		FundTransfer fund = new FundTransfer(10000, "Akash", "98765432", "Akash");
			fund.Fundamount(30000);
			
			System.out.println(fund.getBalance());
			
			
			
		
	}

}
