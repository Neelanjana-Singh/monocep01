package com.techlabs.model;

public class CurrentAccount extends Account {
	 private double overdraftLimit;
	   
	     public CurrentAccount() 
	     {
	     }

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
	        System.out.println("exceeding overdraft limit debit not possible");
	        return false;
	    }

	    @Override
	    public void display() {
	        super.display();
	        System.out.println("Overdraft Limit: " + overdraftLimit);
	    }

	

}
