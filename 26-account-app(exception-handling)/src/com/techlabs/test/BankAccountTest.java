package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.exception.InsufficientFundsException;
import com.techlabs.exception.NegativeAmountException;
import com.techlabs.model.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Neelanjana", 123, 5000);
       
		Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("choose option : \n1. Deposit \n2. Withdraw \n3. Display \n4. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                  System.out.println("Enter the deposit amount :");
                    double depositAmount = scanner.nextDouble();
                    try {
                        account.deposit(depositAmount);
                        System.out.println("you deposit successfully");
                    } catch (NegativeAmountException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                   System.out.println("Enter the withdraw amount :");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                        System.out.println("you withdraw successfully");
                    } catch (InsufficientFundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (NegativeAmountException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Details of account : ");
                    System.out.println("Account Holder Name : " + account.getAccountName());
                    System.out.println("Account Number : " + account.getAccountNumber());
                    System.out.println("Account Balance : " + account.getAccountBalance());
                    break;
                case 4:
                    System.out.println("Thank you ");
                    exit = true;
                    break;
            }
        }
        scanner.close();
    }
}