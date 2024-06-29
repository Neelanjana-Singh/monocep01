package com.techlabs.ocp.violation.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techlabs.ocp.violation.model.FixedDeposit2;
import com.techlabs.ocp.violation.model.IFestivalInterest;
import com.techlabs.ocp.violation.model.NewYear;
import com.techlabs.ocp.violation.model.Diwali;
import com.techlabs.ocp.violation.model.Holi;
import com.techlabs.ocp.violation.model.Others;
import com.techlabs.ocp.violation.model.SimpleInterest;

public class FixedDepositTest2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<FixedDeposit2> fixedDeposits = new ArrayList<>();
        
        System.out.print("Enter number of persons: ");
        int numberOfInput = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 0; i < numberOfInput; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            
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
            System.out.println("4. Others");
            System.out.print("Enter choice: ");
            int festivalChoice = scanner.nextInt();
            scanner.nextLine(); 

            IFestivalInterest festivalInterest;
            switch (festivalChoice) {
                case 1:
                    festivalInterest = new NewYear();
                    break;
                case 2:
                    festivalInterest = new Diwali();
                    break;
                case 3:
                    festivalInterest = new Holi();
                    break;
                default:
                    festivalInterest = new Others();
            }

            FixedDeposit2 fixedDeposit = new FixedDeposit2(accountNumber, name, principal, duration, festivalInterest);
            fixedDeposits.add(fixedDeposit);
        }
        
        for (FixedDeposit2 fixedDeposit : fixedDeposits) {
            SimpleInterest calculator = new SimpleInterest(fixedDeposit);
            
            System.out.println("\nAccount Number: " + fixedDeposit.getAccountNumber());
            System.out.println("Name: " + fixedDeposit.getName());
            System.out.println("Principal: " + fixedDeposit.getPrincipal());
            System.out.println("Duration: " + fixedDeposit.getDuration() + " years");
            System.out.println("Interest Rate: " + fixedDeposit.getInterest().getInterestRate() + "%");
            System.out.println("Simple Interest: " + calculator.calculateSimpleInterest());
        }

        scanner.close();
    }
}
