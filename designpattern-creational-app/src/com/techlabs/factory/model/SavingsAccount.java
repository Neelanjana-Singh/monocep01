package com.techlabs.factory.model;

public class SavingsAccount implements IAccount {
    private int accNo;
    private String name;
    private double balance;

    public SavingsAccount(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public void credit(double amount) {
        balance += amount;
        System.out.println("Credited " + amount + " to Savings Account. New balance: " + balance);
    }

    @Override
    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Debited " + amount + " from Savings Account. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }

    public int getAccNo() {
        return accNo;
    }

    @Override
    public String toString() {
        return "Savings Account [Account No: " + accNo + ", Name: " + name + ", Balance: " + balance + "]";
    }
}
