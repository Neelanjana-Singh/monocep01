package com.techlabs.operator;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        int originalNumber = number;
        int count = 0, sum = 0;
       while (number != 0) {
            count++;
            number = number / 10;
        }
       number = originalNumber; 

      while (number != 0) {
            int rem = number % 10;
            sum += Math.pow(rem, count);
           number = number / 10;
       }
         
    	  

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
