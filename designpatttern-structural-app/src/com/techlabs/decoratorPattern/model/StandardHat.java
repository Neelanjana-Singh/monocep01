package com.techlabs.decoratorPattern.model;

public class StandardHat implements IHat {
    @Override
    public String getName() {
        return "Standard Hat";
    }

    @Override
    public double getPrice() {
        return 100.0;
    }

    @Override
    public String getDescription() {
        return "It is a standard hat";
    }
}
