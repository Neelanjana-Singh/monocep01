package com.techlabs.test;

import com.techlabs.model.Rectangle1;

public class RectangleTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Rectangle1 rectangle1 = new Rectangle1();
        System.out.println("Enter rectangle1 details:");
        System.out.println("Width:"+rectangle1.getWidth());
        System.out.println("height:"+rectangle1.getHeight());
		rectangle1.calculateArea();
		System.out.println();
		
        rectangle1.setWidth(36);
        rectangle1.setHeight(2);
        System.out.println("Rectangle1 details after modification:");
        System.out.println("Width:"+rectangle1.getWidth());
        System.out.println("height:"+rectangle1.getHeight());
		rectangle1.calculateArea();
		System.out.println();
		
		Rectangle1 rectangle2=new Rectangle1(rectangle1);
		System.out.println("Enter rectangle2 details:");
	    System.out.println("Width:"+rectangle2.getWidth());
	    System.out.println("height:"+rectangle2.getHeight());
	    rectangle2.calculateArea();
	    System.out.println();
	    
	    Rectangle1 rectangle3=new Rectangle1(6,-7);
	    System.out.println("Enter rectangle3 details:");
	    System.out.println("Width:"+rectangle3.getWidth());
	    System.out.println("height:"+rectangle3.getHeight());
	    rectangle3.calculateArea();

	}

}
