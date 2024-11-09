package oops;

public class StudentTest {
	public static void main(String[] args) {
		
		// Object Creation or Object Instantiation.
		Student s1 = new Student(101, "Gaurinath", 92.567);
		// Object holds references of any values is called Reference Variables.
		s1.displayStudentDetails();
		s1.studentResult();
		
		Student s2 = new Student(104, "Prreetham", 95.567);
		s2.displayStudentDetails();
		s2.studentResult();
	}
}
