package com.Clone;

public class Test {
     public static void main(String []args)
           throws CloneNotSupportedException{
    	 Student s1 =new Student(987,"Akash",5000);
    	 Student s2=(Student)s1.clone();
    	 System.out.println(s2.id);
    	 System.out.println(s1.id);
    	 System.out.println(s1 == s2);
     }
}
