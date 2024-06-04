package com.techlab.model;

public class SavingsAccount extends Account {
    private double minBalance;
    
    public SavingsAccount()
    {
    	
    }
    public SavingsAccount(int accountNumber, String name, double balance, double minBalance) {
        super(accountNumber, name, balance);
        this.minBalance = minBalance;
    }

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
        System.out.println("Cannot debit. Minimum balance requirement not met.");
        return false;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Minimum Balance: " + minBalance);
    }
}