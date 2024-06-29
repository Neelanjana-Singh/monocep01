package com.techlabs.scanner;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int number1=scanner.nextInt();
		System.out.println("Enter 2nd number :");
		int number2=scanner.nextInt();
		System.out.println("Number before swap :"+number1+" "+number2);
		number1=number1+number2;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println("Number after swap :"+number1+" "+number2);
	}

}
