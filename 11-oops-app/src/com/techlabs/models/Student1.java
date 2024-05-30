package com.techlabs.models;

public class Student1 {
    
	private int rollnumber;
	private String name;
	private int age;
	
	public void initializeStudent(int rollnumber1,String name1,int age1)
	{
		rollnumber=rollnumber1;
		name=name1;
		age=age1;
	}
    
	public void displayStudent()
	{
		System.out.println("Roll number:"+rollnumber);
		System.out.println("Name::"+name);
		System.out.println("Age:"+age);
	}
}
