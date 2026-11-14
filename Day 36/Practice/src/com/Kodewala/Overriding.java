package com.Kodewala;

public class Overriding {
	public Overriding(String name, String accountNo) {
		super();
		this.name = name;
		this.accountNo = accountNo;
	}
	String name;
	String accountNo;
	
	public void openView() {
		System.out.println(name);
		System.out.println(accountNo);
	}
}

  class Overloadin extends Overriding{
	 

	public Overloadin(String name, String accountNo) {
		super(name, accountNo);
		
	}
	 @Override
	public void openView() {
		System.out.println(name);
		System.out.println(accountNo);
	}

}
