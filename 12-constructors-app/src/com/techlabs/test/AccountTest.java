package com.techlabs.test;

import com.techlabs.model.Account;


public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Account account1=new Account();
	      System.out.println("Details of Accountholder1:");
	      System.out.println("Account number:"+account1.getAccountNumber());
		  System.out.println("Account type:"+account1.getAccountType());
		  System.out.println("Name:"+account1.getName());
		  System.out.println("Balance:"+account1.getBalance());
		  System.out.println();
		  account1.setAccountNumber(1234567);
		  account1.setAccountType("Current");
	      account1.setName("Ram");
	      account1.setBalance(700000);
	      System.out.println("Details of Accountholder1 after modification:");
	      System.out.println("Account number:"+account1.getAccountNumber());
	      System.out.println("Account type:"+account1.getAccountType());
	      System.out.println("Name:"+account1.getName());
	      System.out.println("Balance:"+account1.getBalance());
	      System.out.println();
	      
	      Account account2=new Account(account1);
	      System.out.println("Details of Accountholder2:");
	      System.out.println("Account number:"+account2.getAccountNumber());
		  System.out.println("Account type:"+account2.getAccountType());
		  System.out.println("Name:"+account2.getName());
		  System.out.println("Balance:"+account2.getBalance());
		  System.out.println();
		  
		  Account account3=new Account(2345678,"Saving","Lokesh",400000);
		  System.out.println("Details of Accountholder3:");
	      System.out.println("Account number:"+account3.getAccountNumber());
		  System.out.println("Account type:"+account3.getAccountType());
		  System.out.println("Name:"+account3.getName());
		  System.out.println("Balance:"+account3.getBalance());
		  
	      
	}

}
