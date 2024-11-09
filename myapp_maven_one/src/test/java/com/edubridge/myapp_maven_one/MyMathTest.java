package com.edubridge.myapp_maven_one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyMathTest {
	
	private static MyMath mm;
	
	@BeforeEach
	public void setUp() {
		mm = new MyMath();
	}
	
	@AfterEach
	public void tearUp() {
		mm = null;
	}
	
	@Test
	public void isAuthenticateTest() {
		assertEquals(true, mm.isAuthenticate("admin", "admin123"));
		assertTrue(false, mm.isAuthenticate("admin", "admin123"));
	}
}
