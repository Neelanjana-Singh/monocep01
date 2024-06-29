package com.techlabs.models;

public class Account {
	private double accountnumber;
	private String accounttype;
	private String name;
	private double balance;
	
	public void initializeAccount(double accountnumber1,String accounttype1,String name1,double balance1)
	{
		accountnumber=accountnumber1;
		accounttype=accounttype1;
		name=name1;
		balance=balance1;
	}
	
	public void displayAccount()
	{
		System.out.println("Account Number:"+accountnumber);
		System.out.println("Account Type:"+accounttype);
		System.out.println("Name:"+name);
		System.out.println("Account Balance:"+balance);
	}



	

}
