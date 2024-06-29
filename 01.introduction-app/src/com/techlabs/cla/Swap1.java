package com.techlabs.cla;

public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 =Integer.parseInt(args[0]);
		int number2= Integer.parseInt(args[1]);
		int temp;
		System.out.println("Numbers before swap :"+number1+" "+number2);
		temp=number1;
		number1=number2;
		number2=temp;
		
		System.out.println("Numbers after swap :"+number1+" "+number2);
	}

}
