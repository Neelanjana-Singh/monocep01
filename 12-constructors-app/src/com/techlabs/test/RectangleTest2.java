package com.techlabs.test;

import com.techlabs.model.Rectangle2;

public class RectangleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Rectangle2 rectangle1=new Rectangle2();
          Rectangle2 rectangle2=new Rectangle2(10,20);
          Rectangle2 rectangle3=new Rectangle2(10);
          System.out.println("Width: " + rectangle1.getWidth());
          System.out.println("Height: " + rectangle1.getHeight());
          System.out.println("Width: " + rectangle2.getWidth());
          System.out.println("Height: " + rectangle2.getHeight());
          System.out.println("Width: " + rectangle3.getWidth());
          System.out.println("Height: " + rectangle3.getHeight());
          System.out.println();
          
          rectangle2.setWidth(2);
          rectangle2.setHeight(3);
          System.out.println("Width: " + rectangle2.getWidth());
          System.out.println("Height: " + rectangle2.getHeight());
          
	}

}
