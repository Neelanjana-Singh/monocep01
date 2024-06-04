package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.techlabs.model.CurrentAccount;
import com.techlabs.model.SavingsAccount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input for Current Account using setter methods
        CurrentAccount currentAccount = new CurrentAccount();
        System.out.println("Enter Current Account details:");
        System.out.print("Account No: ");
        currentAccount.setAccno(scanner.nextInt());
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        currentAccount.setName(scanner.nextLine());
        System.out.print("Balance: ");
        currentAccount.setBalance(scanner.nextDouble());
        System.out.print("Overdraft Limit: ");
        currentAccount.setOverdraftLimit(scanner.nextDouble());

        // Input for Savings Account using setter methods
        SavingsAccount savingsAccount = new SavingsAccount();
        System.out.println("\nEnter Savings Account details:");
        System.out.print("Account No: ");
        savingsAccount.setAccno(scanner.nextInt());
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        savingsAccount.setName(scanner.nextLine());
        System.out.print("Balance: ");
        savingsAccount.setBalance(scanner.nextDouble());
        System.out.print("Minimum Balance: ");
        savingsAccount.setMinBalance(scanner.nextDouble());
        

        
        String fileName1="E:\\Java Training\\19-serailizationAnddeserialization\\src\\com\\techlabs\\test\\accounts.txt";
        try  {
        	FileOutputStream file1=new FileOutputStream(fileName1);
        	ObjectOutputStream out=new ObjectOutputStream(file1);
            out.writeObject(currentAccount);
            out.writeObject(savingsAccount);
            out.close();
            file1.close();
            System.out.println("Serialization successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }

       
        
        String fileName2="E:\\Java Training\\19-serailizationAnddeserialization\\src\\com\\techlabs\\test\\accounts.txt";
        try  {
        	FileInputStream file2=new FileInputStream(fileName2);
        	ObjectInputStream in=new ObjectInputStream(file2);
            CurrentAccount deserializedCurrentAccount = (CurrentAccount) in.readObject();
            SavingsAccount deserializedSavingsAccount = (SavingsAccount) in.readObject();

            System.out.println("\nDeserialized Current Account Details:");
            deserializedCurrentAccount.display();

            System.out.println("\nDeserialized Savings Account Details:");
            deserializedSavingsAccount.display();
            in.close();
            file2.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        scanner.close();

	}

}
