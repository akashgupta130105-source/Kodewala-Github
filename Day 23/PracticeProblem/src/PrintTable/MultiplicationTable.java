//Read a number and print it table up to10;
//package PrintTable;
//
//import java.util.Scanner;
//
//public class Multiplication {
//	public static void main(String []args) {
//		
////		Scanner sc1=new Scanner(System.in);
////		System.out.println("Enter a number for your table you want");
////		int table=sc1.nextInt();
////		for ( int i=1; i<=10; i++) {
////		System.out.println("Table of 5 " +  i*table);
////		}
////		sc1.close();
//		
//		
//	}
//
//}
package PrintTable;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Multiplication table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        sc.close();
    }
}
