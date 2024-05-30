package com.techlabs.operator;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number:");
		int number=scanner.nextInt();
		int add=0;
		while(number!=0)
		{
		int rem=number%10;
			add+=rem;
			number=number/10;
		}
		
		System.out.println("Sum of digit:"+add);
        scanner.close();
	}

}
