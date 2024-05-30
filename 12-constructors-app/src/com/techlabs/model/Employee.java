package com.techlabs.model;

public class Employee {
	private int id;
	private String name;
	private double salary;
    
	 public Employee()
	   {
	   	  id=246;
	   	  name="Sneha";
	   	  salary=500000;
	    }
	 public Employee(int id2,String name2,double salary2)
	 {
		 id=id2;
		 name=name2;
		 salary=salary2;
	 }
	 public Employee(Employee employee)
	 {
		 id=employee.getId();
		 name=employee.getName();
		 salary=employee.getSalary();
	 }
	
	public void setId(int id1)
	{
		id=id1;
	}
	public int  getId()
	{
		return id;
	}
	
	public void setName(String name1)
	{
		name=name1;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(double salary1)
	{
		salary=salary1;
	}
	public double  getSalary()
	{
		return salary;
	}

}
