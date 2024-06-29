package com.techlabs.test;

import java.util.Scanner;


import com.techlabs.models.Rectangle1;

public class RectangleTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Input and display details for the first rectangle
	        Rectangle1 rectangle1 = new Rectangle1();
	        System.out.println("Enter details of rectangle:");
	        System.out.print("Enter Width: ");
	        int width = scanner.nextInt();
	        System.out.print("Enter Height: ");
	        int height = scanner.nextInt();
	        rectangle1.initializeRectangle(width, height);
	        System.out.println("Details of the first rectangle:");
	        rectangle1.displayRectangle();
	        rectangle1.calculateArea();
	        
	       scanner.close();
	}

}
