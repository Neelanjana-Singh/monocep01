package com.techlabs.models;

public class Rectangle2 {
	private int width;;
	private int height;
	
	public void setWidth(int width1)
	{
		width=width1;
	}
	public int  getWidth()
	{
		return width;
	}
	public void setHeight(int height1)
	{
		height=height1;
	}
	public int  getHeight()
	{
		return height;
	}
	
	
	
	
	public int calculateArea()
	{
		return height*width;
	}

}
