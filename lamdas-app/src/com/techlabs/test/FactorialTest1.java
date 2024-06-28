package com.techlabs.test;

import com.techlabs.model.IFactorial;

public class FactorialTest1 {

    public static void main(String[] args) {
        System.out.println(fun((int number) -> {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }, 5)); // Passing 5 as the number to calculate factorial
    }

    private static int fun(IFactorial factor, int number) {
        return factor.fact(number);
    }
}
