package com.techlabs.operator;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number:");
		 int number = scanner.nextInt();
	     int originalNumber = number; 
	     int reverse=0;

		while(number!=0)
		{
			int rem=number%10;
			reverse=reverse*10+rem;
			number=number/10;
		}
		if(originalNumber==reverse)
		{
			System.out.println("Palindrome number:");
		}
		else
		{
			System.out.println("Not a palindrome number:");
		}
		scanner.close();
	}

}
