package com.techlabs.model;

public class TaxCalculator {
	
	    private double taxRate;

	    public TaxCalculator(double taxRate) {
	        this.taxRate = taxRate;
	    }

	    public void calculateTax(Invoice invoice) {
	        double tax = invoice.getAmount() * taxRate / 100;
	        invoice.setTax(tax);
	    }
	}



