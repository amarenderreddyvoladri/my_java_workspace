package com.edubridge.myapp_maven_one;

//static import in java.
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcTest {
	
	private Calc c;
	private InterestCalc si;
	
	@BeforeEach
	public  void setup() {
		c = new Calc();		
	}
	
	@AfterEach
	public  void setDown() {
		c = null;		
	}
	
	// class - 2
	@BeforeEach
	public  void setup1() {
		si = new InterestCalc();
	}
	@AfterEach
	public  void setDown1() {
		si = null;
	}
	
//	@BeforeAll //is called on static methods only.
//	public static void setup() {
//		c = new Calc();
	// only 1 object is created for every reference.
//	}
//	@AfterAll  //is called on static methods only.
//	public static void setDown() {
//		c = null;
	// only 1 object is created for every reference.
//	}
	
	@Test
	public void testFindSquare() {		
//		Calc c = new Calc();
		int actual = c.findSquare(10);
		int expected = 100;
		assertEquals(expected, actual);
//		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testFindCube() {	
//		Calc c = new Calc();		
//		Assertions.assertEquals(1000, c.findCube(10));
		assertEquals(1000, c.findCube(10));
	}
	
	// test case for p*t*r /100 interest.
	@Test
	public void testFindSi() {
		assertEquals(10, si.findSi(10, 10, 10));
	}

}
