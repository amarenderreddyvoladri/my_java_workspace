package com.edubridge.elite.main;

import com.edubridge.elite.model.Student;
import com.edubridge.elite.service.StudentService;

public class StudentApp {
	public static void main(String[] args) {
		StudentService ss = new StudentService();
		Student[] students = ss.getAllStudents();
		
		for(Student student : students) {
			System.out.println(student);
		}
	}
}
