package com.techlabs.operator;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number:");
		int number=scanner.nextInt();
		int count=0;
       for(int i=2;i<Math.sqrt(number);i++)
       {
    	   if(number%i==0)
    		count++;
    	 }
       if(number<=1)
       {
    	   System.out.println("not prime");
       }
       else if(count>0)
       {
    	   System.out.println("not prime");
       }
       else
       {
    	   System.out.println(" prime");
       }
       scanner.close();
	}

}
