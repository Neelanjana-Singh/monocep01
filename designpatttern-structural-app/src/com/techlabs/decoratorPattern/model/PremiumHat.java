package com.techlabs.decoratorPattern.model;

public class PremiumHat implements IHat {
    @Override
    public String getName() {
        return "Premium Hat";
    }

    @Override
    public double getPrice() {
        return 300.0;
    }

    @Override
    public String getDescription() {
        return "It is a premium hat";
    }
}
