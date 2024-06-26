package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.InputValidator;

public class InputValidatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputValidator validator = new InputValidator();

        System.out.println("Username Validation:");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.println(validator.validateUsername(username));

        System.out.println("\nPassword Validation:");
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.println(validator.validatePassword(password));

        System.out.println("\nEmail Validation:");
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.println(validator.validateEmail(email));
        scanner.close();
    }
}
