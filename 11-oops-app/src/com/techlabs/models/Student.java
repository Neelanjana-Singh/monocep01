package com.techlabs.models;

public class Student {
	private int rollnumber;
	private String name;
	private int age;
	
	public void initializeStudent()
	{
		rollnumber=10;
		name="Neelanjana";
		age=23;
	}
    
	public void displayStudent()
	{
		System.out.println("Roll number:"+rollnumber);
		System.out.println("Name::"+name);
		System.out.println("Age:"+age);
	}
}
