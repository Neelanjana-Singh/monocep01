package com.techlabs.decoratorPattern.model;

public class OilChange extends CarServiceDecorator {
    public OilChange(ICarService carService) {
        super(carService);
    }

    @Override
    public double getCost() {
        return this.getCarService().getCost() +500;
    }
    
    @Override
    public String getJobDescription() {
        return this.getCarService().getJobDescription() +"and Oil change";
    }
    
    
}

