package com.techlabs.models;

public class Employee1 {
	private int id;
	private String name;
	private double salary;
	
	public void initializeEmployee(int id1,String name1,double salary1)
	{
		id=id1;
		name=name1;
		salary=salary1;
	}
	
	public void displayEmployee()
	{
		System.out.println("Employee Id:"+id);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary:"+salary);
	}

}
