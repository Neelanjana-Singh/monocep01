package com.techlabs.test;

import java.util.Arrays;
import java.util.List;

public class StreamNameTest {

    public static void main(String[] args) {
    List<String> names = Arrays.asList("Ansh", "Neelanjana", "Muskan", "Atharva", "Divya");

        
        System.out.println("First 3 students sorted in ascending order:");
        names.stream()
            .sorted().limit(3)
            .forEach((x)->System.out.println(x));

        
        System.out.println("\nFirst 3 students  in ascending which contains 'a':");
        names.stream()
            .filter(name -> name.contains("a"))
            .sorted().limit(3)
            .forEach((x)->System.out.println(x));

      
        System.out.println("\nStudents in descending order:");
        names.stream()
            .sorted((a, b) -> b.compareTo(a))
            .forEach((x)->System.out.println(x));

        
        System.out.println("\nFirst 3 characters of all names:");
        names.stream()
            .map(name -> name.length() > 3 ? name.substring(0, 3) : name)
            .forEach((x)->System.out.println(x));

       
        System.out.println("\nNames of the students contains less than or equal to 4 characters:");
        names.stream()
            .filter(name -> name.length() <= 4)
            .forEach((x)->System.out.println(x));
    }
}
