package com.techlabs.model;

public class Car extends FourWheeler{
	private double price;
   
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	 public void display() {
	        System.out.println("Company Name: " + getCompanyName());
	        System.out.println("Mileage: " + getMileage());
	        System.out.println("Price: " + price);
	    }

}
