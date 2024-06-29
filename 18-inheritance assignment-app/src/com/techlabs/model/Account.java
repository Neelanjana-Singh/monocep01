package com.techlabs.model;

public class Account {
	  private int accountnumber;
	  private String name;
	  private double balance;

	    public Account() {
	        // Default constructor
	    }
	    public Account(int accountnumber, String name, double balance) {
			super();
			this.accountnumber = accountnumber;
			this.name = name;
			this.balance = balance;
		}


	    public int getAccountNumber() {
	        return accountnumber;
	    }

	    public void setAccountNumber(int accountnumber) {
	        this.accountnumber = accountnumber;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getBalance() {
	        return balance;
	    }

	   
		public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public void credit(double amount) {
	        balance += amount;
	    }

	    public boolean debit(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            return true;
	        }
	        return false;
	    }

	    public void display() {
	        System.out.println("Account No: " + accountnumber);
	        System.out.println("Name: " + name);
	        System.out.println("Balance: " + balance);
	    }

}
