package com.techlabs.model;

public class Rectangle2 {
	private double width;;
	private double height;
	
	public Rectangle2()
	{
		this(5,5);
	}
	public Rectangle2(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	public Rectangle2(double width)
	{
		this(width,5);
	}
	
	public void setWidth(double width)
	{
		this.width=width;
	}
	public double  getWidth()
	{
		return this.width;
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public double  getHeight()
	{
		return this.height;
	}
	

}
