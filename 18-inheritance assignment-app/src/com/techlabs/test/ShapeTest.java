package com.techlabs.test;

import com.techlabs.model.Circle;
import com.techlabs.model.Rectangle;
import com.techlabs.model.Shape;

public class ShapeTest {

	public static void main(String[] args) {
//		Circle circle=new Circle(10);
//		circle.area();
//		
//		Rectangle rectangle =new Rectangle(10,20);
//		rectangle.area();
		
		Shape circle=new Circle(10);
		circle.area();
		
		Shape rectangle =new Rectangle(10,20);
		rectangle.area();
		Shape.print();

	}

}
