package com.techlabs.test;

import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer> addFunction = (num1, num2) -> num1 + num2;
        Integer sum = addFunction.apply(10, 20);
        System.out.println("Sum of two numbers is : " + sum);
        
        
        BiFunction<String, Integer, Double> concatAndConvert = (str, num) -> Double.parseDouble(str + num);
        String strValue = "10";
        Integer intValue = 20;
        Double result = concatAndConvert.apply(strValue, intValue);

        System.out.println("Concatenated and converted value: " + result);
    

	}

}
