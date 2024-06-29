package com.techlabs.string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer middleName=new StringBuffer("Prasad");
		StringBuilder lastName=new StringBuilder("Singh");
		String firstName=new String("Prasad");
		
		concat1(middleName);
		System.out.println(middleName);
		
		concat2(lastName);
		System.out.println(lastName);
		
		concat3(firstName);
		System.out.println(firstName);

	}
	private static void concat3(String firstName)
	{
		firstName=firstName+"Techlabs Mumbai";
	}
	private static void concat2(StringBuilder lastName)
	{
		lastName=lastName.append("Swabhav Techlabs");
	}

	private static void concat1(StringBuffer middleName)
	{
		middleName=middleName.append("Swabhav Mumbai");
	}


}
