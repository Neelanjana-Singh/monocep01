package com.techlabs.factory.test;

import com.techlabs.factory.model.AccountFactory;
import com.techlabs.factory.model.CurrentAccount;
import com.techlabs.factory.model.IAccount;
import com.techlabs.factory.model.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IAccountTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<IAccount> accounts = new ArrayList<>();
        int choice = -1;

        while (choice != 0) {
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Credit Amount");
            System.out.println("4. Debit Amount");
            System.out.println("5. Display Account Details");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account No: ");
                    int savingsAccNo = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String savingsName = scanner.next();
                    System.out.print("Enter Initial Balance: ");
                    double savingsBalance = scanner.nextDouble();
                    IAccount savingsAccount = AccountFactory.getAccount("Savings", savingsAccNo, savingsName, savingsBalance, 0);
                    accounts.add(savingsAccount);
                    break;
                case 2:
                    System.out.print("Enter Account No: ");
                    int currentAccNo = scanner.nextInt();
                    System.out.print("Enter Name: ");
                    String currentName = scanner.next();
                    System.out.print("Enter Initial Balance: ");
                    double currentBalance = scanner.nextDouble();
                    System.out.print("Enter Overdraft Limit: ");
                    double overdraftLimit = scanner.nextDouble();
                    IAccount currentAccount = AccountFactory.getAccount("Current", currentAccNo, currentName, currentBalance, overdraftLimit);
                    accounts.add(currentAccount);
                    break;
                case 3:
                    if (!accounts.isEmpty()) {
                        System.out.print("Enter Account No: ");
                        int accNoCredit = scanner.nextInt();
                        System.out.print("Enter Amount to Credit: ");
                        double creditAmount = scanner.nextDouble();
                        for (IAccount account : accounts) {
                            if (account instanceof SavingsAccount && ((SavingsAccount) account).getAccNo() == accNoCredit) {
                                account.credit(creditAmount);
                                break;
                            } else if (account instanceof CurrentAccount && ((CurrentAccount) account).getAccNo() == accNoCredit) {
                                account.credit(creditAmount);
                                break;
                            }
                        }
                    } else {
                        System.out.println("No account found. Create an account first.");
                    }
                    break;
                case 4:
                    if (!accounts.isEmpty()) {
                        System.out.print("Enter Account No: ");
                        int accNoDebit = scanner.nextInt();
                        System.out.print("Enter Amount to Debit: ");
                        double debitAmount = scanner.nextDouble();
                        for (IAccount account : accounts) {
                            if (account instanceof SavingsAccount && ((SavingsAccount) account).getAccNo() == accNoDebit) {
                                account.debit(debitAmount);
                                break;
                            } else if (account instanceof CurrentAccount && ((CurrentAccount) account).getAccNo() == accNoDebit) {
                                account.debit(debitAmount);
                                break;
                            }
                        }
                    } else {
                        System.out.println("No account found. Create an account first.");
                    }
                    break;
                case 5:
                    if (!accounts.isEmpty()) {
                        for (IAccount account : accounts) {
                            System.out.println(account.toString());
                        }
                    } else {
                        System.out.println("No accounts available to display.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        }

        scanner.close();
    }
}
