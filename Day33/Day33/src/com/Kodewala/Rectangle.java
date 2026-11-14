package com.Kodewala;

public class Rectangle {
	
	int length;
	int width;
	
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public int plot() {
		int area= length*width;
		System.out.println(area);
		return area;
	}
	
	public int plotParemeter(){
		int para =length +length +width +width;
		System.out.println(para);
		return para;
	}

}
