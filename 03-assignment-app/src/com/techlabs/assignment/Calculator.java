package com.techlabs.assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter height:");
	        int Height = scanner.nextInt();
	        int Cost1 = 0;
	    

	        if (Height > 120) {
	            System.out.println("Can ride");
	            System.out.println("Enter Age");
	            int Age = scanner.nextInt();
	            if (Age >= 45 && Age <= 55) {
	                Cost1 = 0;
	            } else if (Age > 18) {
	                Cost1 = 12;
	            } else if (Age >= 12 && Age <= 18) {
	                Cost1 = 7;
	            } else if ( Age < 12) {
	                Cost1 = 5;
	            }
	            System.out.println("Want Photos (Yes/No):");
		        scanner.nextLine(); 
		        String str = scanner.nextLine();

		        if (str.equalsIgnoreCase("Yes")) {
		            Cost1+=3;
		            
		        } 
	            
	        }
	        else {
	            System.out.println("Cannot ride");
	        }
	        System.out.println("total bill is " +Cost1);
    scanner.close();
	       
		
	}

}
