package com.Kodewala1;

public class Employee {
	
	String name;
	double baseSalary;
	public Employee(String name, double baseSalary) {
		super();
		this.name = name;
		this.baseSalary = baseSalary;
	}
	double claculateSalary() {
		return baseSalary;
	}
}
 
class Manger extends Employee{
	double bonus;

	public Manger(String name, double baseSalary, double bonus) {
		super(name, baseSalary);
		this.bonus = bonus;
	}
	
	double calculateSalary() {
		return super.claculateSalary()+bonus;
	}
	  
	public  class Main{
		public static void main(String []args) {
			Employee e = new Employee("Ravi",50000);
			Employee m = new Manger("Pirya",80000,20000);
			
			System.out.println(e.claculateSalary());
			System.out.println(m.claculateSalary());
		}
	}
}
