package com.edubridge.project2.test;

import com.edubridge.project2.test.Calc;

public class CalcTest {
	public static void main(String[] args) {
		
		int square = Calc.findSquare(10);
		int cube  = Calc.findCube(10);
		
		System.out.println(square);
		System.out.println(cube);
	}
}
