package com.junit.calculator;

public class FindSecondHigh {
	
	public static void main(String[] args) {
		
		int[] arr = {7,6,8,99,10,25,654,87,99,364,589,999,999,999,999,8,88,55,22,44,77,66,98,89,32,100};
		
		int a = arr[0];
		int b = arr[1];
		System.out.println(arr.length);
		
		for(int i=2;i<=arr.length-1;i++) {
			if(arr[i] > a) {
				if(a > b) {
					b = a;
					a = arr[i];
					
				}
			}
		}
		System.out.println(a+" "+ b);
	}

}
