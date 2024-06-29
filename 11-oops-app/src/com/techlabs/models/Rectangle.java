package com.techlabs.models;

public class Rectangle {
	
		private double width;;
		private double height;
		
		public void initializeRectangle(double width1,double height1)
		{
			width=width1;
			height=height1;
		}
		
		
		public void displayRectangle()
		{
			System.out.println("Width of rectangle:"+width);
			System.out.println("Height of rectangle:"+height);
		
		}
		public double calculateArea()
		{
			return height*width;
		}


}
