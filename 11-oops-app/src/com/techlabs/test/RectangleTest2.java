package com.techlabs.test;

import java.util.Scanner;
import com.techlabs.models.Rectangle2;
public class RectangleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		 Rectangle2 rectangle1 = new Rectangle2();
	        System.out.println("Enter rectangle details:");
	        System.out.print("Enter width: ");
	        int width = scanner.nextInt();
	        rectangle1.setWidth(width);
	        System.out.print("Enter height: ");
	        int height = scanner.nextInt();
	        rectangle1.setHeight(height);
	        System.out.println("\nDetails of the first rectangle:");
	        System.out.println("Width: " + rectangle1.getWidth());
	        System.out.println("Height: " + rectangle1.getHeight());
	        System.out.println("Area: " + rectangle1.calculateArea());
	        scanner.close();

	}


	
}

