package com.techlabs.test;

import java.util.function.Consumer;

public class FactorialTest2 {

    public static void main(String[] args) {
     Consumer<Integer> factorial = (arg) -> {
            int result = 1;
            for (int i = 1; i <= arg; i++) {
                result *= i;
            }
            System.out.println("Factorial of " + arg + " is : " + result);
        };
         factorial.accept(5);
    }
}
