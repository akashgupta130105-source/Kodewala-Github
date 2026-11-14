package com.Kodewla;

public class Account {
	public void openAccount(String userId, String email)
	{
		System.out.println("Account.openAccount()");
	}

}
class SavingAccount extends Account{
	public void openAccount(String userId, String email) {
		System.out.println("SavingAccount.openAccount()");
	}
}
class SrCitAccount extends SavingAccount{
	public void openAccount(String userId, String email) {
		System.out.println("SrCitAccount.openAccount()");
	}
}
class PensionAccount extends SrCitAccount{

public void openAccount(String userId,String email) {
	System.out.println("PensionAccount.openAccount()");
}
}

