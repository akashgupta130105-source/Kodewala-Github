package com.kodwala;

public class Triangle implements Shape {
	double aside;
    double bside;
    double cside;
        public Triangle(double aside, double bside, double cside) {
		if(aside+bside<=cside||aside+cside<=bside||bside+cside<=aside) {
			throw new IllegalArgumentException("Inavalid triangle sides");
		}
		this.aside = aside;
		this.bside = bside;
		this.cside = cside;
	}

		
	@Override
	public double area() {
		double s=(aside+bside+cside)/2;
		
		return Math.sqrt(s*(s-aside)*(s-bside)*(s-cside));
	}

	@Override
	public double perimeter() {
		
		return aside+bside+cside;
	}
     
}
