package com.techlabs.dip.violation.test;

import com.techlabs.dip.violation.model.TaxCalculator;

public class TaxCalculatorTest {
    public static void main(String[] args) {
        
        TaxCalculator t1 = new TaxCalculator();
        int tax1 = t1.calculateTax(100, 10);
        System.out.println("Calculated Tax 1: " + tax1);

        
        TaxCalculator t2 = new TaxCalculator();
        int tax2 = t2.calculateTax(2000, 20);
        System.out.println("Calculated Tax 2: " + tax2);
    }
}

