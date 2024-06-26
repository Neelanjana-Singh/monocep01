package com.techlabs.model;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cost = calculateRideCost(scanner);
        System.out.println("Total bill is " + cost);
        scanner.close();
    }

    private static int calculateRideCost(Scanner scanner) {
        System.out.println("Enter height:");
        int height = scanner.nextInt();
        int cost = 0;

        if (height <= 120) {
            System.out.println("Cannot ride");
            return cost;
        }

        System.out.println("Can ride");
        int age = askForAge(scanner);
        cost = calculateAgeCost(age);
        cost += askForPhotos(scanner) ? 3 : 0;

        return cost;
    }

    private static int askForAge(Scanner scanner) {
        System.out.println("Enter Age:");
        return scanner.nextInt();
    }

    private static int calculateAgeCost(int age) {
        if (age >= 45 && age <= 55) {
            return 0;
        }
        if (age > 18) {
            return 12;
        }
        if (age >= 12 && age <= 18) {
            return 7;
        }
        // age < 12
        return 5;
    }

    public static boolean askForPhotos(Scanner scanner) {
        System.out.println("Want Photos (Yes/No):");
        scanner.nextLine();
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("Yes");
    }
}
