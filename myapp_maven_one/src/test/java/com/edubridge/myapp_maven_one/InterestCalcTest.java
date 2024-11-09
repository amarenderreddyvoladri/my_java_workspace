package com.edubridge.myapp_maven_one;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InterestCalcTest {
	
	private InterestCalc ic;
	
	@BeforeEach
	public void setUp() {
		ic = new InterestCalc();
	}
	
	@AfterEach
	public void testUp() {
		ic = null;
	}
	
	@Test
	public void findSiTest() {
		assertEquals(400, ic.findSi(20000, 1, 2));
	}
}
