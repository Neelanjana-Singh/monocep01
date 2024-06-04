package com.techlab.model;

class Account {
    private int accountNumber;
    private String name;
    private double balance;
    
    public Account()
    {
    	
    }

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public boolean debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        System.out.println("Insufficient balance. Debit not possible.");
        return false;
    }

    public void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
