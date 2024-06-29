package com.techlabs.models;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public void initializeEmployee()
	{
		id=123;
		name="Neelanjana";
		salary=40000;
	}
	
	public void displayEmployee()
	{
		System.out.println("Employee Id:"+id);
		System.out.println("Employee Name::"+name);
		System.out.println("Employee Salary:"+salary);
	}

}
