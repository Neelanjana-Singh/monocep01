package com.techlabs.model;

public class Circle extends Shape{
     private int radius;
	
	public Circle(int radius) {
		
		this.radius = radius;
	}

	public void area() {
		System.out.println("Area of circle is:"+(3.14*radius*radius));
		
	}
	

}