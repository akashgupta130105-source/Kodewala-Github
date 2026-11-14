package com.leetcode;

public class Fianl {
	public static void main() {
		GenralProduct gp = new GenralProduct("Rice",5,01.2005);
		System.out.println(gp.name+" and " +gp.quantity+" and "+gp.dateOfExprie);
		BookStore bs = new BookStore("Maths","NCERT",210,2020);
		System.out.println(bs.bookSubject+" and "+bs.bookName+" and "+bs.price+" and "+bs.yearOfPublication);
		Mobile mb = new Mobile("Samsung M34",1400,1, 128);
		System.out.println(mb.model+" and "+mb.price+" and "+ mb.warranty+" and "+mb.configration);
		Cloths cs = new Cloths("Jeans",1400,32);
		System.out.println(cs.item+" and "+cs.price+" and "+cs.size);
		
	}

}
