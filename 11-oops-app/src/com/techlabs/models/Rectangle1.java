package com.techlabs.models;

public class Rectangle1 {
	private int width;;
	private int height;
	
	public void initializeRectangle(int width1,int height1)
	{
		width=width1;
		height=height1;
	}
	
	
	public void displayRectangle()
	{
		System.out.println("Width of rectangle:"+width);
		System.out.println("Height of rectangle:"+height);
	
	}
	public void calculateArea()
	{
	     int area=height*width;
	     System.out.println("Area of rectangle is:"+area);
	}
}
