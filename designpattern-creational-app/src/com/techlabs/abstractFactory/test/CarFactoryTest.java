package com.techlabs.abstractFactory.test;

import com.techlabs.abstractFactory.model.ICarFactory;
import com.techlabs.abstractFactory.model.MahindraFactory;
import com.techlabs.abstractFactory.model.MarutiFactory;
import com.techlabs.abstractFactory.model.TataFactory;

public class CarFactoryTest {

	public static void main(String[] args) {
		 ICarFactory marutiFactory = new MarutiFactory();
	        ICarFactory maruti = marutiFactory.makeCar();
	        System.out.println(maruti); 

	        ICarFactory tataFactory = new TataFactory();
	        ICarFactory tata = tataFactory.makeCar();
	        System.out.println(tata); 

	        ICarFactory mahindraFactory = new MahindraFactory();
	        ICarFactory mahindra = mahindraFactory.makeCar();
	        System.out.println(mahindra); 

	}

}
