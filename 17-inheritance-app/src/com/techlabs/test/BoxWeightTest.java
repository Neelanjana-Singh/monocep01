package com.techlabs.test;

import com.techlabs.model.BoxWeight;

public class BoxWeightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BoxWeight boxWeight=new BoxWeight();
     boxWeight.depth=20;
     boxWeight.width=30;
     boxWeight.height=40;
     boxWeight.weight=100;
     
     System.out.println("Depth:"+boxWeight.depth);
     System.out.println("Width:"+boxWeight.width);
     System.out.println("Height:"+boxWeight.height);
     System.out.println("Weight:"+boxWeight.weight);
     
     
     
	}

}
