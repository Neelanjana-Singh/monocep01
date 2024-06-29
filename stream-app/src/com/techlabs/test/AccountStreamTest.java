package com.techlabs.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.techlabs.model.Account;

public class AccountStreamTest {

    public static void main(String[] args) {
        List<Account> accounts = Arrays.asList(
                new Account(1, "Ansh", 5000.0),
                new Account(2, "Neelanjana", 15000.0),
                new Account(3, "Muskan", 8000.0),
                new Account(4, "Atharva", 12000.0),
                new Account(5, "Divya", 4000.0)
        );

       
        Optional<Account> minBalanceAccount = accounts.stream()
                .min((a, b) -> Double.compare(a.getBalance(), b.getBalance()));
        minBalanceAccount.ifPresent(account -> 
            System.out.println("Account with minimum balance: " + account));

        
        Optional<Account> maxBalanceAccount = accounts.stream()
                .max((a, b) -> Double.compare(a.getBalance(), b.getBalance()));
        maxBalanceAccount.ifPresent(account -> 
            System.out.println("Account with maximum balance: " + account));

        
        System.out.println("Names with more than 6 characters:");
        accounts.stream()
                .filter(account -> account.getName().length() > 6)
                .map(Account::getName)
                .forEach(System.out::println);

       
        double totalBalance = accounts.stream()
                .mapToDouble(Account::getBalance)
                .sum();
        System.out.println("Total balance of all accounts: " + totalBalance);
    }
}
