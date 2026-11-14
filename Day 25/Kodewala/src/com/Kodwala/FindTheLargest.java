//arr[]=[1,8,7,56,90]
//output=90
package com.Kodwala;

public class FindTheLargest {
	public static void main(String [] args) {
		int [] nums= {1, 8,7,56,90	};
		int largest =nums[0];
		for(int n : nums) {
			if (n>largest) {
				largest=n;
				
			}
		}
		System.out.println("Largest element " + largest);
	}

}
