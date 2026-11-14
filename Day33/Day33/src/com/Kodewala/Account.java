package com.Kodewala;

public class Account {
	
	int minBalance=1000;
	public String  openAccount(String name,int IntBal) {
		System.out.println("Account.openAccount()...");
		return "Some string ";
	}

}
class SavingAccount extends Account{
	//1 Method name should be same 
	//2 Type Order and number of args should be same
	//3  Return type should be same except covariant
	//4 access modifier --> should be same or widen (Public --> public ,
	// protected --> protected or public )
	@Override //you are telling compiler that i am overriding the method please check all the rules;
	public String openAccount(String _name, int _intiBal) {
		System.out.println("SavingAccount.openAccount()");
		return "Some String";
		
	}
}
