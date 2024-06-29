package com.techlabs.ocp.violation.test;
import java.util.Scanner;
import com.techlabs.ocp.violation.model.FixedDeposit1;
import com.techlabs.ocp.violation.model.IFestivalInterest;
import com.techlabs.ocp.violation.model.NewYear;
import com.techlabs.ocp.violation.model.Diwali;
import com.techlabs.ocp.violation.model.Holi;
import com.techlabs.ocp.violation.model.Others;

public class FixedDepositTest1 {

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
        System.out.println("4. Others");
        System.out.print("Enter choice: ");
        int festivalChoice = scanner.nextInt();
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

        FixedDeposit1 fd = new FixedDeposit1(accountNumber, name, principal, duration, festivalInterest);
        System.out.println("\nAccount Number: " + fd.getAccountNumber());
        System.out.println("Name: " + fd.getName());
        System.out.println("Principal: " + fd.getPrincipal());
        System.out.println("Duration: " + fd.getDuration() + " years");
        System.out.println("Interest Rate: " + festivalInterest.getInterestRate() + "%");
        System.out.println("Simple Interest: " + fd.calculateSimpleInterest());

        scanner.close();
    }
}