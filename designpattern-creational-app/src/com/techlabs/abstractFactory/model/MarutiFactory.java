package com.techlabs.abstractFactory.model;

public class MarutiFactory implements ICarFactory {
    @Override
    public ICarFactory makeCar() {
        return new MarutiFactory();
    }
    
    @Override
    public String toString() {
        return "MarutiFactory";
    }
}