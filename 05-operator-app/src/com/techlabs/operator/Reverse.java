package com.techlabs.operator;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number:");
		int number=scanner.nextInt();
		int reverse=0;
		while(number!=0)
		{
			int rem=number%10;
			reverse=reverse*10+rem;
			number=number/10;
		}
		System.out.println("Reverse of  number:"+reverse);
		scanner.close();
	}

}
