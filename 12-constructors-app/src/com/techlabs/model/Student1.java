package com.techlabs.model;

public class Student1 {
	private int rollnumber;
	private String name;
    private int age;
    
    public Student1()
    {
   	  rollnumber=46;
   	  name="Sneha";
   	  age=23;
    }
    
    public Student1(int rollnumber2,String name2,int age2)
    {
    	name=name2;
    	rollnumber=rollnumber2;
    	age=age2;
    }
    public Student1(Student1 student)
    {
    	name=student.getName();
    	rollnumber=student.getRollNumber();
    	age=student.getAge();
    }
    public void setRollNumber(int rollnumber)
	{
		this.rollnumber=rollnumber;
	}
	public int  getRollNumber()
	{
		return rollnumber;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge( int age)
	{
		this.age=age;
	}
	public int  getAge()
	{
		return age;
	}


}
