package com.Kodewla;


	public class ArraySchool {
		
	    public void getSecondLargest(int[] args) {
	        // code here
	        int[] s= {12,35,1,10,34,1};
	        int first = s[0]; int second =s[0];
	        for(int i = 1; i<s.length; i++) {
	        	if(s[i]>first) {
	        		second = first;
	        		first = s[i];
	        	}else if(s[i] >second) {
	        		second =s[i];
	        	}
	        }
            System.out.println("Second Largest Element: "+ second);
	    }

		
		}


