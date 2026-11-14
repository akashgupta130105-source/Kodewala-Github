//find the minimum and maximum of the given arr.

package com.Kodwala;

public class Min2 {
	public static void main(String [] args) {
		int arr[]= {-3, 4, 3, 5, 8, 6};
		int min =arr[0];
		for (int i=1; i<arr.length; i++) {
			if
			(arr[i]<min) {
				min=arr[i];
			
				
			}
		}
		System.out.println("Minimum value" + min);
	}

}
