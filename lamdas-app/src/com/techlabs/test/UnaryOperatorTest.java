package com.techlabs.test;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> increment = (n) -> n + 1;
        Integer result1 = increment.apply(5);
        System.out.println("After increment the number is: " + result1);
        
        
        UnaryOperator<Integer> decrement = (n) -> n - 1;
        Integer result2 = decrement.apply(5);
        System.out.println("After decrement the number is: " + result2);

	}

}
