package com.Clone;

public class Student implements Cloneable{
	int id;
	   String name;
	   int Salary;
   public Student(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
   public Object clone() throws CloneNotSupportedException{
	   return super.clone();
   }
}
