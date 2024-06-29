package com.techlabs.test;

import java.util.function.Predicate;

public class PredicateTest2 {

	public static void main(String[] args) {
		Predicate<String> emailValidator = (email) -> email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");

        String email1 = "example@email.com";
        System.out.println(emailValidator.test(email1));
       

	}

}
