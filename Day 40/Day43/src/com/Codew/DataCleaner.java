package com.Codew;

public class DataCleaner {
	public void clean(Object obj) {
		if(obj instanceof Cleanable) {
			System.out.println("Allowed to perform data cleaning");
		}
		else {
			System.out.println("Not allowed to perform data cleaning");
		}
	}

}
