package com.techlabs.observerPattern.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int accountNumber;
    private String accountName;
    private double balance;
    private List<INotifier> notifiers;
    
    public Account(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.notifiers = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", balance=" + balance + "]";
    }

    public void registerNotifier(INotifier notifier) throws DuplicateNotifierException {
        for (INotifier existingNotifier : notifiers) {
            if (existingNotifier.getClass().equals(notifier.getClass())) {
                throw new DuplicateNotifierException("Notifier already registered.");
            }
        }
        notifiers.add(notifier);
    }
    
    public void removeNotifier(INotifier notifier) throws DuplicateNotifierException {
        boolean canRemove = false;
        for (INotifier existingNotifier : notifiers) {
            if (existingNotifier.getClass().equals(notifier.getClass())) {
                canRemove = true;
                notifiers.remove(notifier);
                break;
            }
        }
        if (!canRemove) {
            throw new DuplicateNotifierException("Notifier does not exist.");
        }
    }
    
    public void deposit(double amount) {
        balance += amount;
        for (INotifier notifier : notifiers) {
            notifier.notifyUser(this, amount, "deposit");
        }
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            for (INotifier notifier : notifiers) {
                notifier.notifyUser(this, amount, "withdrawal");
            }
        }
    }
}
