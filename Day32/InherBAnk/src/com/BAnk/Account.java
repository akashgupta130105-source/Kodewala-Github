package com.BAnk;

public class Account {
	public boolean openAccount(String name, String address, String pan ) {
		connectwithDOB();
		validateNameAndAddress(name,address);
		findAccountByPanCard(pan);
		validatePan(pan);
		createUserId();
		notifyUser();
		return true;
	}
private void notifyUser() {
		System.out.println("Account.notifyUser()");
		
	}
private void createUserId() {
		System.out.println("Account.createUserId()");
		
	}
private void validatePan(String pan) {
		System.out.println("Account.validatePan()");
		
	}
private void findAccountByPanCard(String pan) {
		System.out.println("Account.findAccountByPanCard()");
		
	}
private void connectwithDOB() {
		System.out.println("Account.connectwithDOB()");
		
	}
public boolean validateNameAndAddress(String name, String address) {
	System.out.println("Account.validateNameAndAddress()");
	return true;
}


}
	
	

    


