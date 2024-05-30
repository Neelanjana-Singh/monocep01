package com.techlabs.model;

public class Account1 {
	private int accountnumber;
    private String name;
    private double balance;
    private AccountType accountType;

    public Account1(int accountnumber, String name, double balance, AccountType accountType) {
        super();
        this.accountnumber = accountnumber;
        this.accountType = accountType;
        this.name = name;
        this.balance = balance;
    }

    public Account1() {
        super();
    }

    public void setAccountNumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public int getAccountNumber() {
        return accountnumber;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() { //used to print whole object value
        return "Account [accountnumber=" + accountnumber + ", name=" + name + ", balance=" + balance + ", accountType="
                + accountType + "]";
    }

}
