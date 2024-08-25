package com.junit.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenOddTest {

	@Test
	public void evenOddTest() {
		
		EvenOdd evenOdd = new EvenOdd();
		
		boolean actualResult = evenOdd.evenOrOddNum(11);
		
		boolean expectedResult = true;
		
		assertEquals(actualResult, expectedResult);
	}

}
