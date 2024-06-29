package com.techlabs.dip.violation.model;


public class TaxCalculator {
    private DBLogger logger;

    
    public TaxCalculator(DBLogger logger) {
        this.logger = logger;
    }

   
    public TaxCalculator() {
        this.logger = new DBLogger();
    }

    
    public int calculateTax(int amount, int rate) {
        try {
            int tax = (amount * rate) / 100;
            return tax;
        } catch (Exception e) {
            logger.log("Error calculating tax: " + e.getMessage());
            return 0;
        }
    }
}

 
