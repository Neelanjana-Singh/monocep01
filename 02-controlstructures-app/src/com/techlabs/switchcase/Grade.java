package com.techlabs.switchcase;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Grade:");
		String grade=scanner.next();//use to take character as input
		switch(grade)
		{
		case"A":System.out.println("Excellent");
		     break;
		case"B":System.out.println("Good");
	       break;
		case"C":
		    System.out.println("Need Improvement");
	        break;
		case"D":
		     System.out.println("Need Improvement");
		     break;
		default:System.out.println("Please enter valid Grade");
		     
		}
		scanner.close();

	}

}
