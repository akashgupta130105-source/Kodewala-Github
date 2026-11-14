package com.Kodwala;

public class Largest1 {
      public static void main(String []args) {
    	  int [] nums= {5, 5, 5, 5};
    	  int largest =nums[0];
    	  for(int n: nums) {
    		  if(n>largest) {
    			  largest =n;
    		  }
    	  }
    	  System.out.println("Largest number is " + largest);
      }
}
