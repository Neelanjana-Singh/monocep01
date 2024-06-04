package com.techlabs.model;

public class SavingsAccount extends Account {
    private static final long serialVersionUID = 1L;
    private double minBalance;

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    @Override
    public boolean debit(double amount) {
        if (getBalance() - amount >= minBalance) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Minimum Balance: " + minBalance);
    }
}