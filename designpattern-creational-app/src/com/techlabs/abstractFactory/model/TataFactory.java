package com.techlabs.abstractFactory.model;

public class TataFactory implements ICarFactory {
    @Override
    public ICarFactory makeCar() {
        return new TataFactory();
    }
    
    @Override
    public String toString() {
        return "TataFactory";
    }
}