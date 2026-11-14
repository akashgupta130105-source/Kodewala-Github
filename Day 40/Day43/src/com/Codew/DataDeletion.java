package com.Codew;

public class DataDeletion  {
	public void delete(Object obj) {
		if(obj instanceof Deletation) {
			System.out.println("Allow the deletion");
		}
		else {
			System.out.println("Not allow the deletion");
		}
	}

}
