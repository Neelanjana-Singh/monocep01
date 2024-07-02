package com.techlabs.decoratorPattern.model;

public class RibonedHat extends HatDecorator {
    public RibonedHat(IHat hat) {
        super(hat);
    }

    @Override
    public String getName() {
        return "Ribbon" + this.getHat().getName();
    }

    @Override
    public double getPrice() {
    	return 200 + this.getHat().getPrice();
    }

    @Override
    public String getDescription() {
    	 return this.getHat().getDescription() + "and it's decorated with ribbon";
    }
}