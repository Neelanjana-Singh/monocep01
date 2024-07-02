package com.techlabs.decoratorPattern.model;

public class CarInspection implements ICarService {
    @Override
    public double getCost() {
        return 1000.0;
    }

	@Override
	public String getJobDescription() {
		return "Car Service";
	}
}

