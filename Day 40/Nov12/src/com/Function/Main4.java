package com.Function;

public class Main4 {
	public static void main(String []args) {
		SalaryValidatator sal=(int salary)->{
			if(salary>50000) {
				return true;
			}
			return false;	
		};
		SalaryValidatator sal1=(int salary)->{
			if(salary>100000) {
				return true;
			}
			return false;
		};
		System.out.println(sal.validation(51000));
		System.out.println(sal1.validation(510000));
		
		
		
	}

}
