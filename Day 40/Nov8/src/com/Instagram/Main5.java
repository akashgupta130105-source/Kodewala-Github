package com.Instagram;

public class Main5 {
	public static void main(String []args) {
	String a ="Java";
	String b="Java";
	String c =new String ("Java");
	a=a.concat("8");
    System.out.println(a==b);
    System.out.println(b==c);
    System.out.println(b.equals(c));
    System.out.println(a.equals(c));
    /*
     * output 1 = false
     * output2 = false
     * output3 = true
     * output 4 = false
     */
	}  

}
