package com.techlabs.model;

public class Rectangle extends Shape{
	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
	
		this.length = length;
		this.breadth = breadth;
	}

	
	public void area() {
		System.out.println("Area of rectangle is:"+length*breadth);
		
	}

}
