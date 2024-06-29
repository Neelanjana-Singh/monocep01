package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.models.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Input and display details for the first rectangle
	        Rectangle rectangle1 = new Rectangle();
	        System.out.println("Enter details of rectangle:");
	        System.out.print("Enter Width: ");
	        double width = scanner.nextDouble();
	        System.out.print("Enter Height: ");
	        double height = scanner.nextDouble();
	        rectangle1.initializeRectangle(width, height);
	        System.out.println("Details of the first rectangle:");
	        rectangle1.displayRectangle();
	        System.out.println("Area of rectangle: " + rectangle1.calculateArea());
	        System.out.println();
	        scanner.close();

	}

}
