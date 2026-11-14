package com.amazon.constructor;


import java.util.ArrayList;
import java.util.List;

public class Practise1 {
	public static void main(String []args) {
	List<String> li = new ArrayList<>();
	li.add("Java");
	li.add("Python");
	li.add("DSA");
	li.add("C++");
	System.out.println("Elements of listare;");
	for(String s : li) {
		System.out.println(s);
	}
	}
}
