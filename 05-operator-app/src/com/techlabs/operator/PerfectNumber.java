package com.techlabs.operator;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int number = scanner.nextInt();
            int sum=0;
	        for (int i = 1; i < number; i++) {
	            if (number % i == 0) {
	                sum+=i;
	            }
	        }
	        if(number==sum)
	        {
	        	System.out.println("Perfect number");
	        }
	        else
	        {
	        	System.out.println("Not a Perfect number");
	        }

	        scanner.close();

	}

}
