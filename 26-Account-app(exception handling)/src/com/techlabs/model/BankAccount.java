package com.techlabs.model;

import com.techlabs.exception.InsufficientFundsException;
import com.techlabs.exception.NegativeAmountException;

public class BankAccount {
    private String accountName;
    private long accountNumber;
    private double accountBalance;

    public BankAccount(String accountName, long accountNumber, double accountBalance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Cannot deposit a negative amount.");
        }
        this.accountBalance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Cannot withdraw a negative amount.");
        }
        if (this.getAccountBalance() < amount) {
            throw new InsufficientFundsException();
        }
        this.accountBalance -= amount;
    }
}