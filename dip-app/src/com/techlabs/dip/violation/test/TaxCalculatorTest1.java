package com.techlabs.dip.violation.test;

import com.techlabs.dip.violation.model.DBLogger1;
import com.techlabs.dip.violation.model.FileLogger;
import com.techlabs.dip.violation.model.TaxCalculator1;

public class TaxCalculatorTest1 {
    public static void main(String[] args) {
        
        TaxCalculator1 t1 = new TaxCalculator1(new DBLogger1());
        t1.calculateTax(2000, 10);

        TaxCalculator1 t2 = new TaxCalculator1(new FileLogger());
        t2.calculateTax(200, 0);
    }
}