package com.techlabs.ocp.violation.model;

public class SimpleInterest {
    private FixedDeposit2 fixedDeposit;

    public SimpleInterest(FixedDeposit2 fixedDeposit) {
        this.fixedDeposit = fixedDeposit;
    }

    public double calculateSimpleInterest() {
        double interestRate = fixedDeposit.getInterest().getInterestRate();
        return (fixedDeposit.getPrincipal() * interestRate * fixedDeposit.getDuration()) / 100;
    }
}