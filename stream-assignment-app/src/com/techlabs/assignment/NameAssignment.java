package com.techlabs.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NameAssignment {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("E:\\Java Training\\stream-assignment-app\\src\\com\\techlabs\\assignment\\Name"));
        
        List<String> names = new ArrayList<String>();
        
        String line;
        
        try {
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        reader.close();
        
        // 1. Collect names starting with 'A'
        List<String> namesStartingWithA = names.stream()
                                               .filter(name -> name.startsWith("A"))
                                               .collect(Collectors.toList());
        System.out.println("List of the Names Start with 'A':");
        namesStartingWithA.forEach((x)->System.out.println(x));
        
        // 2. Convert all names to upper case
        List<String> upperCaseNames = names.stream()
                                           .map(name -> name.toUpperCase())
                                           .collect(Collectors.toList());
        System.out.println("\nAfter conversion to upper case:");
        upperCaseNames.forEach((x)->System.out.println(x));
        
        // 3. Sort names alphabetically
        List<String> sortedNames = names.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        System.out.println("\nSorting names alphabetically:");
        sortedNames.forEach((x)->System.out.println(x));
        
        // 4. Remove duplicate names
        List<String> uniqueNames = names.stream()
                                        .distinct()
                                        .collect(Collectors.toList());
        System.out.println("\nAfter removing duplicate names from the given list:");
        uniqueNames.forEach((x)->System.out.println(x));
        
        // 5. Collect the names into a new list (including duplicates)
        System.out.println("\nCollect the names into a new list:");
        List<String> newList = names.stream().collect(Collectors.toList());
        newList.forEach((x)->System.out.println(x));
        
        // 6. Count names without 'i'
        long countNamesWithoutI = names.stream()
                                       .filter(name -> !name.contains("i"))
                                       .count();
        System.out.println("\nCount of names without 'i': " + countNamesWithoutI);
        
        // 7. Concatenate all the names into a single string separated by commas
        String concatenatedNames = names.stream()
                                        .collect(Collectors.joining(", "));
        System.out.println("\nConcatenated names: " + concatenatedNames);
        
        // 8. Names starting with 'J', converted to uppercase, and sorted and collected 
        List<String> namesStartingWithJ = names.stream()
                                               .filter(name -> name.startsWith("J"))
                                               .map(String::toUpperCase)
                                               .sorted()
                                               .collect(Collectors.toList());
        System.out.println("\nNames starting with 'J', converted to uppercase, sorted, and collected:");
        namesStartingWithJ.forEach((x)->System.out.println(x));
    }
}
