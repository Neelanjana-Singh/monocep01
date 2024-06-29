package com.techlabs.factory.test;

import com.techlabs.factory.model.CarFactory;
import com.techlabs.factory.model.ICar;

public class ICarTest {

    public static void main(String[] args) {
    	ICar car;
    	
    	car=CarFactory.getCar("Maruti");
    	car.start();
    	car.stop();
        System.out.println();
        
    	car=CarFactory.getCar("Tata");
    	car.start();
    	car.stop();
        System.out.println();
        
        car=CarFactory.getCar("Mahindra");
    	car.start();
    	car.stop();
        System.out.println();
    	
    }
}
