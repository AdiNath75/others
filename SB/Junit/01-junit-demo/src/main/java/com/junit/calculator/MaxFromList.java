package com.junit.calculator;

import java.util.List;
import java.util.Optional;

public class MaxFromList {

	public static void main(String[] args) {

		List<Integer> l1 = List.of(1, 5, 8, 7, 9, 5, 46, 33, 45, 44);

		Optional<Integer> max = l1.stream().max(Integer::compareTo);

		max.ifPresent(System.out::println);
		
		Integer max1 = l1.stream().max(Integer::compare).get();

		System.out.println(max1);
	}

}
