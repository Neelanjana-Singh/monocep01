package com.techlabs.model;

import com.techlabs.exception.AgeNotValidException;

public class Voter {
	private String name;
	private int age;
	public Voter(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void vote()
	{
		if(age<18)
			throw new AgeNotValidException();
		System.out.println(name+" has casted a vote");
	}

}
