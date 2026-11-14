package com.Kodewala;

public class Main3 {
	public static void main(String []args) {
		EmployeeValidator employee=amount->{
			if(amount>50000) {
				return true;
			}else {
				return false;
			}
		};
		boolean result = employee.validate(60000);
		System.out.println(result);
	}
}

	
