package com.leetcode;

public class Leetcode {
	public static void main(String []args) {
		UserDetail ud = new UserDetail("Akash", 98765432, "Akash1234", "akash@gmail.com");
		System.out.println(ud.name+" and "+ud.mobile+" and "+ud.password+" and "+ud.gmail);
		UserDetail ud1 = new UserDetail("Vikash");
		System.out.println(ud1.gmail);
		
	}

	
	

}
