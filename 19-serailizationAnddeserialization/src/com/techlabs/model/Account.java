package com.techlabs.model;
import java.io.*;


class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    private int accountnumber;
    private String name;
    protected double balance;
    public int getAccno() {
        return  accountnumber;
    }

    public void setAccno(int accountnumber ) {
        this.accountnumber =  accountnumber;
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
        return false;
    }

    public void display() {
        System.out.println("Account No: " +  accountnumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
