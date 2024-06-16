package com.techlabs.model2;

import com.techlabs.model1.SuperClass;

public class DifferentPackageSubClass extends SuperClass {

	public static void main(String[] args) {
		DifferentPackageSubClass object1=new DifferentPackageSubClass();
		object1.display();
		
		//SuperClass object2=new SuperClass();
		//object2.display();--> this cause an error 

	}

}
