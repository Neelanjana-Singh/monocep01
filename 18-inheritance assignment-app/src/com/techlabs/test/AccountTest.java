package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.CurrentAccount;
import com.techlabs.model.SavingsAccount;

public class AccountTest {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	    

	      
	        CurrentAccount currentAccount = new CurrentAccount();
	        System.out.println("Enter Current Account details:");
	        System.out.print("Account No: ");
	        currentAccount.setAccountNumber(scanner.nextInt());
	        scanner.nextLine(); 
	        System.out.print("Name: ");
	        currentAccount.setName(scanner.nextLine());
	        System.out.print("Balance: ");
	        currentAccount.setBalance(scanner.nextDouble());
	        System.out.print("Overdraft Limit: ");
	        currentAccount.setOverdraftLimit(scanner.nextDouble());

	        
	        SavingsAccount savingsAccount = new SavingsAccount();
	        System.out.println("\nEnter Savings Account details:");
	        System.out.print("Account No: ");
	        savingsAccount.setAccountNumber(scanner.nextInt());
	        scanner.nextLine(); // Consume newline
	        System.out.print("Name: ");
	        savingsAccount.setName(scanner.nextLine());
	        System.out.print("Balance: ");
	        savingsAccount.setBalance(scanner.nextDouble());
	        System.out.print("Minimum Balance: ");
	        savingsAccount.setMinBalance(scanner.nextDouble());

	       
	        System.out.println("\nCurrent Account Details:");
	        currentAccount.display();
	        System.out.print("Enter amount to debit from Current Account: ");
	        double currentDebitAmount = scanner.nextDouble();
	        System.out.println("Debiting " + currentDebitAmount + " from Current Account: " + currentAccount.debit(currentDebitAmount));
	        currentAccount.display();

	        
             System.out.println("\nSavings Account Details:");
	        savingsAccount.display();
	        System.out.print("Enter amount to debit from Savings Account: ");
	        double savingsDebitAmount = scanner.nextDouble();
	        System.out.println("Debiting " + savingsDebitAmount + " from Savings Account: " + savingsAccount.debit(savingsDebitAmount));
	        savingsAccount.display();

	        scanner.close();
	    }
	}


