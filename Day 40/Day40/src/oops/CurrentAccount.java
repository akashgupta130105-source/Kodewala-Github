package oops;

public class CurrentAccount extends IAccount{

	private double balance;
	public CurrentAccount(double balance) {
		super(balance);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	

	

	@Override
	public double deposit(double amount) {
		if(amount<=0) {
			 throw new IllegalArgumentException(
		                "Deposit amount must be positive"
		            );
		}
		return balance= balance+amount;
	}

	@Override
	public double withdrawal(double amount) {
		if(balance<=amount) {
			 throw new IllegalArgumentException("Withdrawal amount is not greater than balance");
		                
		}
		
		return  balance=balance-amount;
	}

	@Override
	public double transfer(double amount) {
		if(balance<=0) {
			 throw new IllegalArgumentException("transder amount is never be negative");
		                
		}
		return balance =balance-amount;
	}

	

}
