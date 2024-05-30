package com.techlabs.Whileloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	       

	        int factorial = 1;
	        int i = 1;
	        while (i <= number) {
	            factorial *= i;
	            i++;
	        }

	        System.out.println("Factorial of " + number + " is: " + factorial);
	        scanner.close();
	}

}
