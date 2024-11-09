package com.edubridge.project2.test;

import com.edubridge.myproject1.util.Calc;
import com.edubridge.project3.test2.CalcIntrest;

// this file is demo for exporting and importing jar file in different projects.

public class CalcTest {
	public static void main(String[] args) {
		int square = Calc.findSquare(10);
		int cube = Calc.findCube(10);
		
		System.out.println(square);
		System.out.println(cube);
		
		double i = CalcIntrest.findIntrest(12000, 2, 18);
		System.out.println("Principal Intrest : "+i);
	}
	
}
