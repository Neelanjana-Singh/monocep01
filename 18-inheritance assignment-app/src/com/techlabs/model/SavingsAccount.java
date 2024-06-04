package com.techlabs.model;

public class SavingsAccount extends Account{
	 private double minBalance;

	    public SavingsAccount() {
	        // Default constructor
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
	        System.out.println("For maintainig minimun balance debit not possible");
	        return false;
	    }

	    @Override
	    public void display() {
	        super.display();
	        System.out.println("Minimum Balance: " + minBalance);
	    }

}
