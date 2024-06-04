package com.techlabs.model;

class FourWheeler extends Vehicle {
    private static final long serialVersionUID = 1L; // Add serialVersionUID
    private double mileage;

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}