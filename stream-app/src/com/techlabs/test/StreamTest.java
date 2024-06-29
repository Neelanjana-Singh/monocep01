package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamTest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(25, 10, 99, 40, 55);
        
//        Stream<Integer> numbersStream=numbers.stream();
//        numbersStream.forEach((x)->System.out.println(x+5));
        
        System.out.println("All numbers:");
        numbers.stream()
        .forEach((x)->System.out.println(x+5));
        
        
        System.out.println("All odd numbers:");
        numbers.stream()
        .filter((x)->x%2!=0)
        .forEach((x)->System.out.println(x));
        
        List<Integer> evenNumbers=numbers.stream()
        		.filter((x)->x%2==0)
        		.collect(Collectors.toList());
        
        
        System.out.println("All Even numbers:");
        evenNumbers.stream()
        .forEach((x)->System.out.println(x));
        
        
        int addition=numbers.stream().reduce(0, (sum,x)->sum+x);
        System.out.println("sum of elements of list:"+addition);
        
        
        System.out.println("After multiplication with 5:");
        List<Integer> multiplyers=numbers.stream()
            .map((x)->x*5).
            collect(Collectors.toList());
        multiplyers.forEach((x)->System.out.println(x));
        
        System.out.println("sorted:");
        numbers.stream().sorted()
        .forEach((x)->System.out.println(x));
        
        System.out.println("First three sorted:");
        numbers.stream().sorted().limit(3)
        .forEach((x)->System.out.println(x));
        
    }
}
