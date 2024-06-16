package com.techlab.test;

import java.util.Scanner;
import com.techlab.model.CurrentAccount;
import com.techlab.model.SavingsAccount;

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
        CurrentAccount currentAccount1 = null;
        SavingsAccount savingsAccount1 = null;

        while (true) {
            System.out.println("Select Account Type :");
            System.out.println("1. Savings");
            System.out.println("2. Current");
            System.out.println("3. Exit");
            System.out.print("Enter Your Choice: ");
            int accountChoice = scanner.nextInt();

            if (accountChoice == 3) {
<<<<<<< HEAD
            	System.out.println("Exit");
=======
                System.out.println("Exit");
>>>>>>> d8beaa17bf248ec647a29d78cd83c707b183230e
                break;
            }

            while (true) {
                System.out.println("\nSelect Operation :");
                System.out.println("1. Create Account");
                System.out.println("2. Display Account Details");
                System.out.println("3. Credit into Account");
                System.out.println("4. Debit from Account");
                System.out.println("5. Exit");
                System.out.print("Enter Your Choice: ");
                int operationChoice = scanner.nextInt();

                if (operationChoice == 5) {
                    break;
                }

                switch (operationChoice) {
                    case 1:
                        System.out.println("You selected creating a new account");
                        System.out.print("Enter Account Number: ");
                        int accountNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Account Holder Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Opening Balance: ");
                        double balance = scanner.nextDouble();

                        if (accountChoice == 1) {
                            System.out.print("Enter Minimum Balance: ");
                            double minBalance = scanner.nextDouble();
                            savingsAccount1 = new SavingsAccount(accountNumber, name, balance, minBalance);
                            System.out.println("Savings Account is created.");
                        } else if (accountChoice == 2) {
                            System.out.print("Enter Overdraft Limit: ");
                            double overdraftLimit = scanner.nextDouble();
                            currentAccount1 = new CurrentAccount(accountNumber, name, balance, overdraftLimit);
                            System.out.println("Current Account is created.");
                        }
                        break;

                    case 2:
                        if (accountChoice == 1 && savingsAccount1 != null) {
                            savingsAccount1.display();
                        } else if (accountChoice == 2 && currentAccount1 != null) {
                            currentAccount1.display();
                        } else {
                            System.out.println("No account found. Please create an account first.");
                        }
                        break;

                    case 3:
                       
                        if (accountChoice == 1 && savingsAccount1 != null) {
                        	 System.out.print("Enter Amount to Credit: ");
                        	 double creditAmount = scanner.nextDouble();
                            savingsAccount1.credit(creditAmount);
                            System.out.println("Amount credited to Savings Account.");
                        } else if (accountChoice == 2 && currentAccount1 != null) {
                        	 System.out.print("Enter Amount to Credit: ");
                        	 double creditAmount = scanner.nextDouble();
                            currentAccount1.credit(creditAmount);
                            System.out.println("Amount credited to Current Account.");
                        } else {
                            System.out.println("No account found. Please create an account first.");
                        }
                        break;

                    case 4:
                       
                        if (accountChoice == 1 && savingsAccount1 != null) {
                        	 System.out.print("Enter Amount to Debit: ");
                             double debitAmount = scanner.nextDouble();
                            boolean success = savingsAccount1.debit(debitAmount);
                            System.out.println("Debiting from Savings Account: " + (success ? "Success" : "Failure"));
                        } else if (accountChoice == 2 && currentAccount1 != null) {
                        	 System.out.print("Enter Amount to Debit: ");
                             double debitAmount = scanner.nextDouble();
                            boolean success = currentAccount1.debit(debitAmount);
                            System.out.println("Debiting from Current Account: " + (success ? "Success" : "Failure"));
                        } else {
                            System.out.println("No account found. Please create an account first.");
                        }
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
        scanner.close();
    }
}
