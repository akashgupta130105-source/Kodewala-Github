package com.Poly;

public class School {
	public boolean admission(String name,int standard,int admissionNo) {
		validateName(name);
		validateEligblity(standard);
		finalAdmissonNo(admissionNo);
		return true; 
	}
	private void validateName(String name) {
		System.out.println("School.validateName()");
	}
	private void validateEligblity(int standard) {
		System.out.println("School.validateEligblity()");
	}
	private void finalAdmissonNo(int admissionNo) {
		System.out.println("School.finalAdmissonNo()");
	}

}
