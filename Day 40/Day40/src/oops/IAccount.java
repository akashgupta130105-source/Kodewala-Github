package oops;

public class IAccount {
	private double balance;
	public IAccount(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	

	

	
	public double deposit(double amount) {
		if(amount<=0) {
			 throw new IllegalArgumentException(
		                "Deposit amount must be positive"
		            );
		}
		return balance= balance+amount;
	}

	
	public double withdrawal(double amount) {
		if(balance<=amount) {
			 throw new IllegalArgumentException("Withdrawal amount is not greater than balance");
		                
		}
		
		return  balance=balance-amount;
	}

	
	public double transfer(double amount) {
		if(balance<=0) {
			 throw new IllegalArgumentException("transder amount is never be negative");
		                
		}
		return balance =balance-amount;
	}

	
	
	
    
    
	

}
