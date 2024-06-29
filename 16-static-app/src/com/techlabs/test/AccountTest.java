package com.techlabs.test;

import com.techlabs.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Account account1=new Account(1234,"Neel",4000000);
		 account1.display();
		 Account account2=new Account(1224,"Neela",5000000);
		 account2.display();
		 Account account3=new Account(1222,"Shivam",6000000);
		 account3.display();
		 System.out.println("Total account created:"+Account.getAccountCount());
		 
		 

	       

	}

}
