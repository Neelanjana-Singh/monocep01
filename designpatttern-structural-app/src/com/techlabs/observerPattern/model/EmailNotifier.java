package com.techlabs.observerPattern.model;

public class EmailNotifier implements INotifier {

    @Override
    public void notifyUser(Account account, double amount, String transactionType) {
        System.out.println("Transaction occurred of amount: " + amount);
        System.out.println("Email notification for transaction for account number: " + account.getAccountNumber());
        System.out.println("Current Balance is: " + account.getBalance());
        System.out.println();
    }

   
}
