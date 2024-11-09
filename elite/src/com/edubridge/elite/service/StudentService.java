package com.edubridge.elite.service;

//Student Class imported.
import com.edubridge.elite.model.Student;

public class StudentService {
	Student[] students;

	public StudentService() {
		students = new Student[] { new Student(1001, "Sairam Ali Khan", "sai456@gmail.com", 7658996785L),
				new Student(1002, "Sairam Shek", "sai234@gmail.com", 9988996785L),
				new Student(1003, "Sairam faroooq", "sai123@gmail.com", 8796996785L), };
	}

	public Student[] getAllStudents() {
		return students;
	}

}
