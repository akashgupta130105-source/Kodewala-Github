package com.Kodwala;

public class Largest2 {
public static void main(String [] args) {
	int [] find = {10};
	int largest =find[0];
	for (int n: find) {
		if(n >largest) {
			n=largest;
			System.out.println("Largest number is " +  largest);
		}
	}
	}
}

