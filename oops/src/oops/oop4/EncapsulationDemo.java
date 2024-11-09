package oops.oop4;

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		
		Student s = new Student(1001, "Sathwik","satwik@gmail.com",7659118704L);
		
//		System.out.println(s.studentId);
		
		// here we cannot access the properties of student class with private.
		
		// to access the private properties from student class we
		// use getters/setters to access them efficiently.
		
		// we can also use setters to set values to private methods without
		// any constructor of the particular class.
		
		// accesing the student properties.
		System.out.println(s.getStudentId());
		System.out.println(s.getStudentMail());
		System.out.println(s.getStudentMobile());
		System.out.println(s.getStudentName());	
		
	}
}
