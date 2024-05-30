package com.techlabs.scanner;

import java.util.Scanner;

public class Substraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int number1=scanner.nextInt();
		System.out.println("Enter 2nd number :");
		int number2=scanner.nextInt();
		int diff=number1-number2;
		System.out.println("Substraction :"+diff);
	}

}
