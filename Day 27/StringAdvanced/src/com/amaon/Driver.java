package com.amaon;

class AccountMgmt//This class can not become parent
{
	final int UPI_LIMIT =100000;//Constant in java
	public final void doSomething1() 
		
	{
		UPI_LIMIT = 200000;//able to the value
	}
	public void doSomething2()
	{
		//some function...... andriod
	}
}
class Account extends AccountMgmt{
	
	public void doSomething2() {
		
	}
	
}

public class Driver {
	

}
