package com.techlabs.facadePattern.test;

import java.util.Scanner;

import com.techlabs.facadePattern.model.HotelReception;
import com.techlabs.facadePattern.model.IMenu;

public class HotelTest {

	public static void main(String[] args) {
		 HotelReception reception = new HotelReception();
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("1. Get Indian Menu");
	            System.out.println("2. Get Italian Menu");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            IMenu menu = null;
	            switch (choice) {
	                case 1:
	                    menu = reception.getIndianMenu();
	                    break;
	                case 2:
	                    menu = reception.getItalianMenu();
	                    break;
	                
	                case 3:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	                    continue;
	            }

	            if (menu != null) {
	                menu.displayMenu();
	            }
	        }

	}

}
