package com.Kodewala;

public class Main1 {
	public static void main(String []args ) {
		Calculator add=(int a ,int b)->{
			int addition=a+b;
			
			System.out.println(" Total add value "+ addition );
			return a+b;
			
		};
		int result =add.add(2,5 );
		System.out.println(result);
		
		
		
	}

}
