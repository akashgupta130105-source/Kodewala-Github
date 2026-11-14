

package com.Kodewla;
//Here is the single  Inheritance
public class Student {
	
		public void classAttendence(String name, int rollNo)
		{
			System.out.println("Student.classAttendence()");
			
			System.out.println(name );
			System.out.println(rollNo );
		}
		

	}
	class Topper extends Student {
		public void classAttendence(String name, int rollNo)
		{
			System.out.println("Topper.classAttendence()");
		}
		
	}
//	Here is the multilevel Inheritance
	
//	class Average extends Topper {
//		public void classAttendence(String name, int rollNo)
//		{
//			System.out.println("Average.classAttendence()");
//		}
//	}
//	
//	// after This is overall is hierarchical
//	class BelowAverage extends Average{
//		public void classAttendence(String name, int rollNo)
//		{
//			System.out.println("Average.classAttendence()");
//		}

	
//	}


