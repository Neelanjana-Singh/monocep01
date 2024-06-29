package com.techlabs.model;

public class StaticDemo {
	
	private int number1;
	
	private static  int number2;
	
	public StaticDemo()
	{
		number1=0;
		number2=0;
		System.out.println("constructor invoked");
	}
	
	public void increment()
	{
		number1++;
		number2++;
	}
	
	public void display()
	{
		System.out.println("Number1:"+number1);
		System.out.println("Number2:"+number2);
	}
	
	static
	{
		System.out.println("hello neel");
	}

}
