package com.techlabs.model;

public class Account {
    private int accountnumber;
    private String name;
    private double balance;
    private String accounttype;


    public Account()
	   {
    	 accountnumber=246;
	   	 name="Sneha";
	   	 balance=500000.0;
	   	 accounttype="Saving";
	    }
	 public Account(int accountnumber2,String accounttype2,String name2,double balance2)
	 {
		 accountnumber=accountnumber2;
		 accounttype=accounttype2;
		 name=name2;
		 balance=balance2;
	 }
	 public Account(Account account)
	 {
		 accountnumber=account.getAccountNumber();
		 accounttype=account.getAccountType();
		 name=account.getName();
		 balance=account.getBalance();
	 }
  

    public void setAccountNumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getAccountNumber() {
        return accountnumber;
    }

    public void setAccountType( String accountType) {
        this.accounttype = accountType;
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
