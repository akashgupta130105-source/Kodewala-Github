package com.Codew;

public class DataInsertion {
	public void insert(Object obj) {
		if(obj instanceof Insertion) {
			System.out.println("Allow the insertion");
		}
		else {
			System.out.println("Not allow the insertion");
		}
		
	}

}
