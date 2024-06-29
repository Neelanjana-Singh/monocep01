package com.techlabs.test;

import com.techlabs.model.Point1;

public class PointTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point1 point1=new Point1();
	      System.out.println("Point1:");
	      System.out.println("("+point1.getX()+","+point1.getY()+")");
	      point1.setX(10);
	      point1.setY(20);
	      System.out.println("("+point1.getX()+","+point1.getY()+")");
	      System.out.println();
	      Point1 point2=new Point1(point1);
	     // System.out.println("Point2:");
	      System.out.println(point1.hashCode());
	      System.out.println(point2.hashCode());
	     // System.out.println("("+point2.getX()+","+point2.getY()+")");
	      point2=point1;
	      System.out.println(point1.hashCode());
	      System.out.println(point2.hashCode());
	      System.out.println("Point2:");
	      System.out.println("("+point2.getX()+","+point2.getY()+")");
	      Point1 point3=new Point1(25,50);
	      System.out.println("Point3:");
	      System.out.println("("+point3.getX()+","+point3.getY()+")");

	}

}
