package com.edubridge.myapp_maven_one;

public class Calc {
	
	public Calc() {
		System.out.println("Calc object is created! ");		
	}
	
	public int findSquare(int num) {
		return num*num;
	}
	
	public int findCube(int num) {
		return num*num*num;
	}
}
