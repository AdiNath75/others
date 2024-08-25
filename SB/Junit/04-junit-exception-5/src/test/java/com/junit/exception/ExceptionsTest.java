package com.junit.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExceptionsTest {

	Exceptions exception = new Exceptions();
	
	@Test
	public void stringLengthCheckTest() {
		
		String str = null;
		assertThrows(NullPointerException.class, ()-> exception.stringLengthCheck(str));
	}
	
	@Test
	public void divOpreationTest() {
		int c = 0;;
		assertThrows(ArithmeticException.class, ()-> exception.divOpreation(125, c));
	}
	

}
