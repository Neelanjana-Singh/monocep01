package com.techlabs.model;

public class Rectangle1 {
	private int width;;
	private int height;
	
	public Rectangle1()
	{
		width=14;
		height=4;
	}
	public Rectangle1(int width,int height)
	{
		this.width=width;
		this.height=height;
	}
	public Rectangle1(Rectangle1 rectangle)
	{
		width=rectangle.getWidth();
		height=rectangle.getHeight();
	}
	
	public void setWidth(int width)
	{
		this.width=width;
	}
	public int  getWidth()
	{
		return this.width;
	}
	public void setHeight(int height)
	{
		this.height=height;
	}
	public int  getHeight()
	{
		return this.height;
	}
	
	
	
	
	public void calculateArea()
	{
		int area= height*width;
		System.out.println("Area of rectangle:"+area);
	}


}
