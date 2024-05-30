package com.techlabs.typecasting;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number=100.5;
		int number1=100;
		double number2=number1;//implicit type conversion //widening expression
		
		int number3=(int)number;//type casting//explicit//narrowing expression
		
		boolean flag=true;
		// int flag2=(int)flag;
		int number4=10;
		Scanner scanner=new Scanner(System.in);
		float number6=10.5f;
		
		byte number7=15;
		byte number8=3;
		byte multiplication;
		multiplication=(byte)(number7*number8);
		//multiplication=(byte)number7*number8;--> this gives error
		//multiplication=number7*number8;-->this also gives error

	}

}
