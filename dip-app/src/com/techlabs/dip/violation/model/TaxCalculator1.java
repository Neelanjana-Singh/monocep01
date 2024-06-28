package com.techlabs.dip.violation.model;

public class TaxCalculator1 {
    private ILogger logger;

    public TaxCalculator1(ILogger logger) {
        this.logger = logger;
    }

    public void setLogger(ILogger logger) {
        this.logger = logger;
    }

    public ILogger getLogger() {
        return logger;
    }

    public void calculateTax(int amount, int rate) {
        try {
            if (rate == 0) {
                throw new IllegalArgumentException("Rate cannot be zero");
            }
            double tax = (amount * rate) / 100;
            System.out.println("Tax: " + tax);
        } catch (Exception e) {
            logger.log(e.getMessage());
        }
    }
}
