package com.amaon;

public class Driver2 {
	public static void main (String []args) {
		QueryGenrator obj = new QueryGenrator();
		StringBuilder res = obj.generateQuery(1300,"Akash");
		System.out.println(res);
	}

}
