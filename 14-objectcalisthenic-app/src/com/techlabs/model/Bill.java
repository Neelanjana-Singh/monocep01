package com.techlabs.model;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Scanner scan = new Scanner(System.in);
	        System.out.println("Enter no. of units consumed :");
	        int number = scan.nextInt();
	        int Metre = 75;
	        int charge = calculateBill(number);
	        System.out.println("Total_water_bill=" + (charge + Metre));
	        scan.close();
	    }

	    public static int calculateBill(int units) {
	        int charge=1;
	        if (units <= 100) {
	            charge = units * 5;
	            return charge;
	        }
	        else if (units <= 250) {
	            charge = units * 10;
	        } 
	        if(units>250) {
	            charge = units * 20;
	        }
	        return charge;
	}

}
