package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.models.Account1;

public class AccountTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account1 account1=new Account1();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter details of first Account holder:");
		System.out.println("Enter account number:");
		long accountnumber=scanner.nextInt();
		account1.setAccountNumber(accountnumber);
		System.out.println("Enter account type:");
		String accounttype=scanner.next();
		account1.setAccountType(accounttype);
		System.out.println("Enter  Name:");
		String name=scanner.next();
		account1.setName(name);
		System.out.println("Enter balance:");
		double balance=scanner.nextDouble();
		account1.setBalance(balance);
		
		System.out.println("Details of first Account holder");
		System.out.println("Account number:"+account1.getAccountNumber());
		System.out.println("Account type:"+account1.getAccountType());
		System.out.println("Name:"+account1.getName());
		System.out.println("Balance:"+account1.getBalance());
		System.out.println();
		
		Account1 account2=new Account1();
		
		System.out.println("Enter details of second Account holder:");
		System.out.println("Enter account number:");
		accountnumber=scanner.nextLong();
		account2.setAccountNumber(accountnumber);
		System.out.println("Enter account type:");
	    accounttype=scanner.next();
		account2.setAccountType(accounttype);
		System.out.println("Enter Name:");
	    name=scanner.next();
		account2.setName(name);
		System.out.println("Enter balance:");
	    balance=scanner.nextLong();
		account2.setBalance(balance);
		
		System.out.println("Details of second Account holder");
		System.out.println("Account number:"+account2.getAccountNumber());
		System.out.println("Account type:"+account2.getAccountType());
		System.out.println("Name:"+account2.getName());
		System.out.println("Balance:"+account2.getBalance());
		scanner.close();

	}

}
