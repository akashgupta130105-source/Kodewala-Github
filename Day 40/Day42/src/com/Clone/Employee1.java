package com.Clone;

public class Employee1 implements Cloneable {
	 String id;
     String name;
     int salary;
     public Employee1(String id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
     @Override
     public Object clone() throws CloneNotSupportedException{
  	   return super.clone();
     }
	
     
}
