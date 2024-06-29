package com.techlabs.test;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> compareIntegers = (a, b) -> a.equals(b);
		int num1 = 10;
		int num2 = 5;
		System.out.println(compareIntegers.test(num1, num2));

		

		

	}

}
