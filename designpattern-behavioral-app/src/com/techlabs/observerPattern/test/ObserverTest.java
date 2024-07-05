package com.techlabs.observerPattern.test;

import com.techlabs.observerPattern.model.Account;
import com.techlabs.observerPattern.model.DuplicateNotifierException;
import com.techlabs.observerPattern.model.EmailNotifier;
import com.techlabs.observerPattern.model.SmsNotifier;

public class ObserverTest {

    public static void main(String[] args) {
        Account account = new Account(101, "Neelanjana", 50000);
        System.out.println(account);

       try {
		account.registerNotifier(new EmailNotifier());
		//account.registerNotifier(new SmsNotifier());
		account.deposit(1000);
		account.withdraw(100);
		
		//account.registerNotifier(new EmailNotifier());
		account.removeNotifier(new SmsNotifier());
		
	} catch (DuplicateNotifierException e) {
	  System.out.println(e.getMessage());	
	}
    }
}
