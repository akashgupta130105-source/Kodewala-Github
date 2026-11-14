package com.amazon.constructor;

public class ZeptoAccount {
	public static void main(String []args) {
		ZeptoId rider = new ZeptoId();
		System.out.println(rider.name+" and " +rider.phone+" and "+ rider.aadharNumber+" and "+rider.pan );
		ZeptoId rider1 = new ZeptoId(" Bikash ",987654321);
		System.out.println(rider1.name +" and "+rider1.phone);
	}

}
