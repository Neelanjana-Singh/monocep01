package com.techlabs.decoratorPattern.model;

public class GoldenHat extends HatDecorator {
    public GoldenHat(IHat hat) {
        super(hat);
    }

    @Override
    public String getName() {
        return  "Golden" + this.getHat().getName();
    }

    

	@Override
    public double getPrice() {
        return 200 + this.getHat().getPrice();
    }

    @Override
    public String getDescription() {
        return this.getHat().getDescription() + "and it's golden ";
    }
}