package com.Codew;

public class Main {
	public static void main(String []args) {
		AgeValidator ageValidator=age->
		{
			if(age>18) {
				return true;
			}
			else {
				return false;
			}
		};
		boolean result = ageValidator.isEligible(-8);
		System.out.println(result);
	}

}
