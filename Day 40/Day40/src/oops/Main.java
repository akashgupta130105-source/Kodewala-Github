package oops;

public class Main {
	public static void main() {
		IAccount iAccount=new SavingAccount(3000);
		iAccount.deposit(2000);
		System.out.println(iAccount.getBalance());
	}

}
