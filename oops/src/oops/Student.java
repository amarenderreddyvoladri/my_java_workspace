package oops;

public class Student {
	// instance Variables
	int studentId;
	String studentName;
	double studentMarks;
	
	static String batchCode = "2024-12634";
	
	// zero constructor.
	public Student() {
		//Zero Argument Constructor.
		System.out.println(".....constructor from student class.......");
	}	
		
	// Creating the Constructor.
	public Student(int studentId, String studentName, double studentMarks) {
		// We overridden the zero argument Constructor.
		// [ here in constructor all variables are called Local Variables.]
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		// if both [local and instance variables names are same then we must use this keyword.]
		// else both are different names then the this keyword is optional[can go without use.].
	}
	
	
	public void studentResult() {
		if(studentMarks > 40) {
			System.out.println("Student Result : Pass");
		}
		else{
			System.out.println("Student Result : Fail");			
		}
		System.out.println("--------------------------------------");
	}
	
	public void displayStudentDetails() {
		
		System.out.println("Student Id : "+studentId);
		System.out.println("Student Name : "+studentName);
		System.out.println("Student Marks : "+studentMarks);
		System.out.println("Student Batch Code : "+batchCode);
				
	}
}
