package com.techlabs.model;

public class CurrentAccount1 extends Account1 {
	 private double overdraftLimit=-2500;
	   
//	     public CurrentAccount1() 
//	     {
//	     }

	    public CurrentAccount1(int accountnumber, String name, double balance) {
			super(accountnumber, name, balance);
			
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
