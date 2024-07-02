package com.techlabs.decoratorPattern.model;

public abstract class CarServiceDecorator implements ICarService {
    private ICarService carService;

    public CarServiceDecorator(ICarService carService) {
        this.carService = carService;
    }
    
    public ICarService getCarService() {
        return carService;
    } 

    @Override
    public double getCost() {
        return carService.getCost();
    }

    
   public String getJobDescription() {
	  return carService.getJobDescription(); 
   }
}
