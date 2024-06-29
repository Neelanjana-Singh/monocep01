package com.techlabs.factory.model;

public class CurrentAccount implements IAccount {
    private int accNo;
    private String name;
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(int accNo, String name, double balance, double overdraftLimit) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void credit(double amount) {
        balance += amount;
        System.out.println("Credited " + amount + " to Current Account. New balance: " + balance);
    }

    @Override
    public void debit(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Debited " + amount + " from Current Account. New balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded in Current Account.");
        }
    }

    public int getAccNo() {
        return accNo;
    }

    @Override
    public String toString() {
        return "Current Account [Account No: " + accNo + ", Name: " + name + ", Balance: " + balance + ", Overdraft Limit: " + overdraftLimit + "]";
    }
}
