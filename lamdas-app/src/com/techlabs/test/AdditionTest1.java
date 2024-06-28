package com.techlabs.test;

import com.techlabs.model.IAddition;

public class AdditionTest1 {

	public static void main(String[] args) {
		
		System.out.println(fun((int a,int b)->{ return a+b ;}));

	}
	
	private static int fun(IAddition adder)
	{
		return adder.add(20, 30);
	}

}
