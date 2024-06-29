package com.techlabs.test;

import java.util.Scanner;
import com.techlabs.models.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter details of the first account holder:");
		System.out.print("Enter Account Number: ");
		double accountnumber = scanner.nextDouble();
		System.out.print("Enter Account Type:");
		String accounttype = scanner.next();
		System.out.print("Enter Name: ");
	    String name = scanner.next();
		System.out.print("Enter Balance: ");
		double balance = scanner.nextDouble();
		account1.initializeAccount(accountnumber, accounttype, name, balance);
		account1.displayAccount();

		Account account2 = new Account();
		System.out.println("Enter details of the second account holder:");
		System.out.print("Enter Account Number: ");
		accountnumber = scanner.nextDouble();
		scanner.nextLine();  
		System.out.print("Enter Account Type: ");
		accounttype = scanner.next();
		System.out.print("Enter Name: ");
		name = scanner.next();
		System.out.print("Enter Balance: ");
		balance = scanner.nextDouble();
		scanner.nextLine();  
        account2.initializeAccount(accountnumber, accounttype, name, balance);
		account2.displayAccount();

		scanner.close();
	}
}
