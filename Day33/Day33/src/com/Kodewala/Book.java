package com.Kodewala;

public class Book {
	
	String name;
	String pubish;
	int price;
	public Book(String name, String pubish, int price) {
		
		this.name = name;
		this.pubish = pubish;
		this.price = price;
	}

	
	public void schoolBook() {
		System.out.println(name);
		System.out.println(pubish);
		System.out.println(price);
		
	}

	

	public class Page extends Book{
	    int page;
	

	public Page(String name, String pubish, int price,int page) {
		
		super(name, pubish, page);
		
		this.name = name;
		this.pubish = pubish;
		this.price = price;
	}
	public void scholBook() {
		System.out.println(name);
		System.out.println(pubish);
		System.out.println(price);
		System.out.println(page);
		
	}
	}
}
	
	
	
    

