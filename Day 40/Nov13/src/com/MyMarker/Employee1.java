package com.MyMarker;

public class Employee1 implements Cloneable{
	String id;
	String name;
	public Employee1(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	 public Object clone() throws CloneNotSupportedException{
	  	   return super.clone();
	     }

}
