package com.techlabs.ocp.violation.test;

import java.util.Scanner;

import com.techlabs.ocp.violation.model.FixedDeposit;

public class FixedDepositTest {
	  public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Account Number: ");
	        int accountNumber = scanner.nextInt();
	        scanner.nextLine(); 

	        System.out.print("Enter Name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter Principal Amount: ");
	        double principal = scanner.nextDouble();

	        System.out.print("Enter Duration (in years): ");
	        int duration = scanner.nextInt();

	        System.out.println("Select Festival:");
	        System.out.println("1. New Year");
	        System.out.println("2. Diwali");
	        System.out.println("3. Holi");
	        System.out.println("4. Christmas");
	        System.out.println("5. Others");
	        System.out.print("Enter choice: ");
	        int festivalChoice = scanner.nextInt();
	        Festival festival;
	        switch (festivalChoice) {
	            case 1:
	                festival = Festival.NEW_YEAR;
	                break;
	            case 2:
	                festival = Festival.DIWALI;
	                break;
	            case 3:
	                festival = Festival.HOLI;
	                break;
	            
	            default:
	                festival = Festival.OTHERS;
	        }

	        FixedDeposit fd = new FixedDeposit(accountNumber, name, principal, duration, festival);
	        System.out.println("\nAccount Number: " + fd.getAccountNumber());
	        System.out.println("Name: " + fd.getName());
	        System.out.println("Principal: " + fd.getPrincipal());
	        System.out.println("Duration: " + fd.getDuration() + " years");
	        System.out.println("Festival: " + fd.getFestival());
	        System.out.println("Interest Rate: " + fd.getInterestRate() + "%");
	        System.out.println("Simple Interest: " + fd.calculateSimpleInterest());

	        scanner.close();
    }
}
