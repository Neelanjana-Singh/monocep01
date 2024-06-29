package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMethod {

    public static void main(String[] args) {
       

           List<List<Integer>> listOfLists = Arrays.asList(
           Arrays.asList(1, 2, 3),
           Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );

        System.out.println("First Flattened list:");
        List<Integer> flattenedList = listOfLists.stream()
        	.flatMap(list -> list.stream()) // Flatten each list into a single stream
            .collect(Collectors.toList());

        flattenedList.forEach((x) -> System.out.print(x+" "));
        
        System.out.println();
        List<List<String>> ListsOfStrings = Arrays.asList(
        	    Arrays.asList("apple", "banana"),
        	    Arrays.asList("orange", "grape"),
        	    Arrays.asList("pineapple", "strawberry")
        	);
          System.out.println("Second Flattened list:");
        	List<String> flatList = ListsOfStrings.stream()
        	    .flatMap(list->list.stream())
        	    .collect(Collectors.toList());
        	flatList.forEach((x) -> System.out.print(x+" "));

        
        
    }
}
