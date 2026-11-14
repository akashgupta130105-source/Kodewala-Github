package com.Kodewala;

public class Calculator {
	int add(int a,int b) {
		return a+b;
	}
	@Overload
	public int add(int a,int b,int c) {
		return a+b+c;
	}

}
