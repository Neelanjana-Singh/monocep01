package com.techlabs.ifelse;

import java.util.Scanner;

public class Max2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int number1=scanner.nextInt();
		System.out.println("Enter 2nd number :");
		int number2=scanner.nextInt();
		System.out.println("Enter 3rd number :");
		int number3=scanner.nextInt();
		if(number1>number2 && number1>number2)
		{
			System.out.println("1st number is greater than 2nd and 3rd");
		}
		else if(number2>number1 && number2>number3)
		{
			System.out.println("2nd number is greater than 1st and 3rd");
		}
		else
		{
			System.out.println("2nd number is greater than 1st and 3rd");
		}
	}

}
