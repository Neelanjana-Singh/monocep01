package com.techlabs.abstractFactory.model;

public class MahindraFactory implements ICarFactory {
    @Override
    public ICarFactory makeCar() {
        return new MahindraFactory();
    }
    
    @Override
    public String toString() {
        return "MahindraFactory";
    }
}