package com.Kodewala;

public class Driver3 {
	public static void main(String []args) {
		Constructor con = new Constructor("Akash","Banglore",10);
		System.out.println(con.name+" "+con.address+" "+ con.rollNumber);
		Constructor con1 = new Constructor("Vikash","Surat");
		System.out.println(con1.name+ " " + con1.address);
	}

}
