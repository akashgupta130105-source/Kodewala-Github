package com.Pol;

public abstract class Veheicle {
	String name;

	public Veheicle(String name) {
		super();
		this.name = name;
	}
	
	abstract void start();
	abstract void stop();{
		System.out.println(name +"stopped");
	}

}
class Car extends Vehical{
	Car(String name){
		super(String name){
	(name);
		}
	}
