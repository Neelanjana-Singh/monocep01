package com.techlabs.test;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

      
        Function<Integer, Integer> square = (number) -> number * number;
        Integer squareOfNumber = square.apply(4);
        System.out.println("Square of given number is: " + squareOfNumber);

      
        Function<String, Integer> stringLength = (s) -> s.length();
        Integer length = stringLength.apply("Hello, World!");
        System.out.println("Length of string is: " + length);
    }
}
