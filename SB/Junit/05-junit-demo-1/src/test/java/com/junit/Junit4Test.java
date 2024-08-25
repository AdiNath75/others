package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Junit4Test {

	@Test
	public void stringLengthCheckTest() {
		
		Junit4 junit4 = new Junit4();
		
		int stringLengthCheck = junit4.stringLengthCheck("asdfghj");
		
		int expected = 7;
		
		assertEquals(expected, stringLengthCheck);
	}
	
	@Test(expected = NullPointerException.class)
	public void stringLengthExceptionCheckTest() {
		
		Junit4 junit4 = new Junit4();
		
		String str = null;
		
		junit4.stringLengthCheck(str);
		
	}
	
	@Test
	public void divOpreationTest() {
		Junit4 junit4 = new Junit4();
		
		int expected = 3;
		int actual = junit4.divOpreation(456, 123);
		
		assertEquals(expected, actual );	
	}
	
	@Test(expected = ArithmeticException.class)
	public void divOpreationExceptionTest() {
		Junit4 junit4 = new Junit4();
		
		junit4.divOpreation(456, 0);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
