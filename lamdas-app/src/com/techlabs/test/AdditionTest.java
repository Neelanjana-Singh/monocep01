package com.techlabs.test;

import com.techlabs.model.IAddition;

public class AdditionTest {

	public static void main(String[] args) {
	 IAddition adder=(int a,int b)->
	 {
		 return a+b;
	 };
	 System.out.println(adder.add(10, 20));

	}

}
