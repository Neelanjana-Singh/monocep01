package com.techlabs.model;

public abstract class Shape {
	
	public Shape()
	{
		System.out.println("constructor created");
	}
	
	public static void print()
	{
		System.out.println("Print");
	}
	
	public abstract void area();
	public void display()
	{
		System.out.println("Display");
	}

}
