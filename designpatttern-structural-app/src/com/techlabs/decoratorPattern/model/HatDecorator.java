package com.techlabs.decoratorPattern.model;

public abstract class HatDecorator implements IHat {
    private IHat hat;
    
    public HatDecorator(IHat hat) {
        this.hat = hat;
    }
    
    public IHat getHat() {
        return hat;
    }

    @Override
    public String getName() {
        return hat.getName();
    }

    @Override
    public double getPrice() {
        return hat.getPrice();
    }

    @Override
    public String getDescription() {
        return hat.getDescription();
    }
}
