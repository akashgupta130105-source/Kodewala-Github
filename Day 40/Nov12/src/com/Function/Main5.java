package com.Function;

public class Main5 {
    public static void main(String []args) {
    	ISalaryValidation sal=(int salary)->{
			if(salary>50000) {
				return true;
			}
			return false;
    		
    	};
    	ISalaryValidation sal1=(int salary)->{
			if(salary>100000) {
				return true;
			}
			return false;
    		
    	};
    	System.out.println(sal.validate(75000));
    	System.out.println(sal1.validate(75000));
    }
}
