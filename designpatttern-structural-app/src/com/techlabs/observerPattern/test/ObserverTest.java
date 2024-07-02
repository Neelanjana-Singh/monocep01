package com.techlabs.observerPattern.test;

import com.techlabs.observerPattern.model.Account;
import com.techlabs.observerPattern.model.EmailNotifier;
import com.techlabs.observerPattern.model.SmsNotifier;

public class ObserverTest {

    public static void main(String[] args) {
        Account account = new Account(101, "Neelanjana", 50000);
        System.out.println(account);
        
        account.registerNotifier(new EmailNotifier());
        account.registerNotifier(new EmailNotifier()); // This will not register another EmailNotifier
        account.registerNotifier(new EmailNotifier());
        account.registerNotifier(new SmsNotifier());
        account.registerNotifier(new SmsNotifier());
        
        account.withdraw(2000);
    }
}
