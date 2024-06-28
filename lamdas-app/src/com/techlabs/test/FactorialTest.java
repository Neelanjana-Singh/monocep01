package com.techlabs.test;

import com.techlabs.model.IFactorial;

public class FactorialTest {

    public static void main(String[] args) {
        IFactorial factorial = (int number) -> {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println( factorial.fact(4)); 
        System.out.println( factorial.fact(5)); 
    }
}
