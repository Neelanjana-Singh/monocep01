package com.techlabs.ifelse;

import java.util.Scanner;

public class Max1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int number1=scanner.nextInt();
		System.out.println("Enter 2nd number :");
		int number2=scanner.nextInt();
		if(number1>number2)
		{
			System.out.println("1st greater than 2nd");
		}
		else
		{
			System.out.println("2nd greater than 1st");
		}
		scanner.close();

	}

}
