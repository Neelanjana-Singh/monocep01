package com.techlabs.decoratorPattern.model;

public class WheelAlign extends CarServiceDecorator {
    public WheelAlign(ICarService carService) {
        super(carService);
    }

    @Override
    public double getCost() {
        return this.getCarService().getCost() +400;
    }
    
    @Override
    public String getJobDescription() {
        return this.getCarService().getJobDescription() +"and wheel alignment";
    }
    
}
