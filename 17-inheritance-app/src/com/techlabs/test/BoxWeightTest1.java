package com.techlabs.test;


import com.techlabs.model.BoxWeight1;

public class BoxWeightTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BoxWeight1 boxWeight=new BoxWeight1();
	     boxWeight.setDepth(10);
	     boxWeight.setWidth(30);
	     boxWeight.setHeight(50);
	     boxWeight.setWeight(100);
	     System.out.println("Depth :"+boxWeight.getDepth());
	     System.out.println("Height :"+boxWeight.getHeight());
	     System.out.println("Width :"+boxWeight.getWidth());
	     System.out.println("Weight :"+boxWeight.getWeight());

	}

}
