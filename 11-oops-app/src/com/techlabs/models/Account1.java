package com.techlabs.models;

public class Account1 {
	private long accountnumber;
	private String accounttype;
	private String name;
	private double balance;

	
	public void setAccountNumber(long accountnumber1)
	{
		accountnumber=accountnumber1;
	}
	public long  getAccountNumber()
	{
		return accountnumber;
	}

	public void setAccountType(String accounttype1)
	{
		accounttype=accounttype1;
	}
	public String getAccountType()
	{
		return accounttype;
	}
	
	
	public void setName(String name1)
	{
		name=name1;
	}
	public String getName()
	{
		return name;
	}
	public void setBalance(double balance1)
	{
		balance=balance1;
	}
	public double  getBalance()
	{
		return balance;
	}
	

}
