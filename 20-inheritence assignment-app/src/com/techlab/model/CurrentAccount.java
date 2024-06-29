package com.techlab.model;

 public class CurrentAccount extends Account {
    private double overdraftLimit;
    
    public CurrentAccount()
    {
    
    }
    public CurrentAccount(int accountNumber, String name, double balance, double overdraftLimit) {
        super(accountNumber, name, balance);
        this.overdraftLimit = overdraftLimit;
    }
    

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean debit(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            setBalance(getBalance() - amount);
            return true;
        }
        System.out.println("Exceeding overdraft limit. Debit not possible.");
        return false;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
