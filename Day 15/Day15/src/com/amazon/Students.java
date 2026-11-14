package com.amazon;

public class Students {
	static int add(int num1 ,int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static void main(String[] args) {
		
		int secondNo = 10;
		int firstNo = 20;
		int result = add(firstNo,secondNo);
		System.out.println(result);
		
	}

}

