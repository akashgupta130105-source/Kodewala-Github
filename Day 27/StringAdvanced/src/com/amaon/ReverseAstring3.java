package com.amaon;

public class ReverseAstring3 {
	public static void main(String []args ) {
		String str = "Akash is my best Friend";
		char ch[] = str.toCharArray();
		for(int i = ch.length-1; i>=0; i--)
		{
		   System.out.print(ch[i]);
		}
	}

}
