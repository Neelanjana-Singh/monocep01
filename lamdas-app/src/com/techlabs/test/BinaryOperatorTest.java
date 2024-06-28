package com.techlabs.test;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

	public static void main(String[] args) {
		
		  BinaryOperator<Integer> add = (a, b) -> a + b;
	      Integer sum= add.apply(10, 20);
	      System.out.println("sum of two number is " + sum);
	      
	      BinaryOperator<String> concatenate = (s1, s2) -> s1 + s2;
	      String concatenation = concatenate.apply("Hello ", "World!");
	      System.out.println("concatenation of two string:  " + concatenation);

	}

}
