package com.techlabs.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		try
		{
		System.out.println("Enter first number");
		int number1=scanner.nextInt();
		System.out.println("Enter second number");
		int number2=scanner.nextInt();
		
		double division=number1/number2;
		System.out.println("Division is:"+division);
		}
		catch(ArithmeticException e)
		{
			System.out.println("You cannot divide by zero! Change value of number2");
		}
		System.out.println("Byee");
		scanner.close();
		

	}

}
