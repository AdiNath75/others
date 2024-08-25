package com.junit.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator calculators = new Calculator();

	@Test
	public void sumTest() {
//		Calculator calculators = new Calculator();
		
		int acctualResult = calculators.add(10, 15);
		
		int expectedResult = 25;
		
		assertEquals(acctualResult, expectedResult);
		
	}
	
	@Test
	public void subTest() {
//		Calculator calculators = new Calculator();
		
		int acctualResult = calculators.sub(20, 15);
		
		int expectedResult = 5;
		
		assertEquals(acctualResult, expectedResult);
		
	}
	
	@Test
	public void divTest() {
//		Calculator calculators = new Calculator();
		
		int acctualResult = calculators.div(77, 11);
		
		int expectedResult = 7;
		
		assertEquals(acctualResult, expectedResult);
		
	}
	
	@Test
	public void mulTest() {
		
//		Calculator calculators = new Calculator();	
//		int acctualResult = calculators.mul (10, 15);
//		
//		int expectedResult = 150;
		
		assertEquals(100, calculators.mul(20, 5));
		
	}

}
