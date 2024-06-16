package com.techlabs.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		try
		{
		
		int number1=Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		
		
		
		double division=number1/number2;
		System.out.println("Division is:"+division);
		}
		catch(ArithmeticException e)
		{
			System.out.println("You cannot divide by zero! Change value of number2");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("wrong input");
		}
		System.out.println("Bye");
		scanner.close();

	}

}
