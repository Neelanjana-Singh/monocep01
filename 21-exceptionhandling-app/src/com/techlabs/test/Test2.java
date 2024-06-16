package com.techlabs.test;

public class Test2 {

	public static void main(String[] args) {
		try
		{
		
		int number1=Integer.parseInt(args[0]);
		int number2=Integer.parseInt(args[1]);
		
		
		
		double division=calculateDivision(number1,number2);
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
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Bye");
		

	}
	private static double calculateDivision(int number1,int number2)
	{
		double division=0;
		try
		{
			division=number1/number2;
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero");
		}
		return division;
	}

	}


