package com.Poly;

 class Student {
	
	public void studentPerformance() {
		System.out.println("Student.studentPerformance()");
	}

}
class AverageStudent extends Student{
    @Override
	public void studentPerformance() {
		System.out.println("AverageStudent.studentPerformace()");
	}
}
class GoodStudent extends Student{
	@Override
	public void studentPerformance() {
		System.out.println("GoodStudent.studentPerformance()");
	}
}

