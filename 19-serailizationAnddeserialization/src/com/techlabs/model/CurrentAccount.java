package com.techlabs.model;

public class CurrentAccount extends Account {
    private static final long serialVersionUID = 1L;
    private double overdraftLimit;

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean debit(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

