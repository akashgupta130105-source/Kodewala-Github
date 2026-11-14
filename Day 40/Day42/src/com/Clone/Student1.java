package com.Clone;

public class Student1 implements Cloneable {
    public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	int id;
    String name;
    
    public Object clone() throws CloneNotSupportedException{
    	return super.clone();
    }
}
