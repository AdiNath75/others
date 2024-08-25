package com.junit.calculator;

public class EvenOdd {
	
	public boolean evenOrOddNum(int num) {
		
		if(num % 2 == 0) {
			System.out.println("Even number");
			return true;
			
		}else {
			System.out.println("Odd Number");
			return false;
		}
	}

}
