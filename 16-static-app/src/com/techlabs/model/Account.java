package com.techlabs.model;

public class Account {
    private static int accountCount = 0;

    private int accountNumber;
    private String name;
    private double balance;

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        accountCount++;
        System.out.println("Account " + accountCount + " is created.");
    }

    public void display() {
        System.out.println("Account number is: " + accountNumber);
        System.out.println("Name is: " + name);
        System.out.println("Balance is: " + balance);
        //System.out.println("Total accounts created: " + getAccountCount());
    }

    public static int getAccountCount() {
        return accountCount;
    }
    
    
}
