package com.functioal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Geeks1 {
	public static void main(String []args) {
		Demo object = new Demo("Akash","987654");
		String filename="file.ser";
		FileOutputStream file;
		try {
			file = new FileOutputStream(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		
	}

}
