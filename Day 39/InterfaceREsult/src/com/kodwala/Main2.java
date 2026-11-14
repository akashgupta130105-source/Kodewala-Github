package com.kodwala;

public class Main2 {
	public static void main(String []args) {
		Shape shape= new Circle(20);
		
		System.out.println(shape.area());
		System.out.println(shape.perimeter());
		Shape shape1=new Rectangle(8,10);
		System.out.println(shape1.area());
		System.out.println(shape1.perimeter());
		Shape shape2=new Triangle(5,7,10);
		System.out.println(shape2.area());
		System.out.println(shape2.perimeter());
	}

}
