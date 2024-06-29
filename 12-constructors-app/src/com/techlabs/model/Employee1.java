package com.techlabs.model;

public class Employee1 {
	private int id;
	private String name;
	private double salary;
    
	 public Employee1()
	   {
	   	  id=246;
	   	  name="Sneha";
	   	  salary=500000;
	    }
	 public Employee1(int id2,String name2,double salary2)
	 {
		 id=id2;
		 name=name2;
		 salary=salary2;
	 }
	 public Employee1(Employee1 employee)
	 {
		 id=employee.getId();
		 name=employee.getName();
		 salary=employee.getSalary();
	 }
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int  getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double  getSalary()
	{
		return salary;
	}

}
