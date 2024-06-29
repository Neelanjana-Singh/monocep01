package com.techlabs.factory.model;

public class AccountFactory {
    public static IAccount getAccount(String accountType, int accNo, String name, double balance, double overdraftLimit) {
        if (accountType.equalsIgnoreCase("Savings")) 
            return new SavingsAccount(accNo, name, balance);
        if (accountType.equalsIgnoreCase("Current")) 
            return new CurrentAccount(accNo, name, balance, overdraftLimit);
        
        return null;
    }
}
