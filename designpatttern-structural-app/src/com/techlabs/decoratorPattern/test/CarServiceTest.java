package com.techlabs.decoratorPattern.test;

import com.techlabs.decoratorPattern.model.CarInspection;
import com.techlabs.decoratorPattern.model.ICarService;
import com.techlabs.decoratorPattern.model.OilChange;
import com.techlabs.decoratorPattern.model.WheelAlign;

public class CarServiceTest {
    public static void main(String[] args) {
    	
        ICarService carInspection = new CarInspection();
        System.out.println(carInspection.getJobDescription());
        System.out.println(carInspection.getCost());
        System.out.println();

        OilChange oilChange = new OilChange(carInspection);
        System.out.println(oilChange.getJobDescription());
        System.out.println(oilChange.getCost());
        System.out.println();

        WheelAlign wheelAlign = new WheelAlign(oilChange);
        System.out.println(wheelAlign.getJobDescription());
        System.out.println(wheelAlign.getCost());
        System.out.println();
    }
}
