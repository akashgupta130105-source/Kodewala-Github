package com.Kodewala;

public class Payment {
	public boolean paymentProcess(String name, String accountNo,String pan) {
		connectwithDOB();
		validateNameandAccountNo(name,accountNo);
		validatePan(pan);
	    return true;
	}
	private void connectwithDOB(){
		System.out.println("Payment.connectwithDOB()");
	}
	private void validateNameandAccountNo(String name,String accountNo) {
		System.out.println("Payment.validateNameandAccountNo()");
	}
	private void validatePan(String pan){
		System.out.println("Payment.validatePan()");
	}
	
	
	
    
}
