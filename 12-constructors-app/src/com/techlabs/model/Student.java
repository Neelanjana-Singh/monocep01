package com.techlabs.model;

public class Student {
	private int rollnumber;
	private String name;
    private int age;
    
    public Student()
    {
   	  rollnumber=46;
   	  name="Sneha";
   	  age=23;
    }
    
    public Student(int rollnumber2,String name2,int age2)
    {
    	name=name2;
    	rollnumber=rollnumber2;
    	age=age2;
    }
    public Student(Student student)
    {
    	name=student.getName();
    	rollnumber=student.getRollNumber();
    	age=student.getAge();
    }
    public void setRollNumber(int rollnumber1)
	{
		rollnumber=rollnumber1;
	}
	public int  getRollNumber()
	{
		return rollnumber;
	}
	
	public void setName(String name1)
	{
		name=name1;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age1)
	{
		age=age1;
	}
	public int  getAge()
	{
		return age;
	}

}
