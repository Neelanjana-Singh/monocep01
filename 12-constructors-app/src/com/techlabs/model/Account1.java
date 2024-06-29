package com.techlabs.model;

public class Account1 {
	 private long accountnumber;
	    private String accounttype;
	    private String name;
	    private double balance;

	    public Account1() {
	        accountnumber = 246567889;
	        accounttype = "Saving";
	        name = "Sneha";
	        balance = 600000;
	    }
	    public Account1(long accountnumber2,String accounttype2,String name2,double balance2)
	    {
	    	accountnumber=accountnumber2;
	    	accounttype=accounttype2;
	    	name=name2;
	    	balance=balance2;
	    }
	    public Account1(Account1 account)
	    {
	    	accountnumber=account.getAccountNumber();
	    	accounttype=account.getAccountType();
	    	name=account.getName();
	    	balance=account.getBalance();
	    }

	    public void setAccountNumber(long accountnumber) {
	        this.accountnumber = accountnumber;
	    }

	    public long getAccountNumber() {
	        return accountnumber;
	    }

	    public void setAccountType(String accounttype) {
	        this.accounttype = accounttype;
	    }

	    public String getAccountType() {
	        return accounttype;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public double getBalance() {
	        return balance;
	    }

}
