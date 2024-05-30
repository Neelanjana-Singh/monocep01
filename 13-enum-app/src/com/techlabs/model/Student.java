package com.techlabs.model;

public class Student {
	 private int rollNumber;
	    private String name;
	    private int age;
	    private String emailId;

	    public Student(int rollNumber, String name, int age, String emailId) {
	        super();
	        this.rollNumber = rollNumber;
	        this.name = name;
	        this.age = age;
	        this.emailId = emailId;
	    }

	    public Student() {
	        super();
	    }

	    public void setRollNumber(int rollNumber) {
	        this.rollNumber = rollNumber;
	    }

	    public int getRollNumber() {
	        return rollNumber;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setEmailId(String emailId) {
	        this.emailId = emailId;
	    }

	    public String getEmailId() {
	        return emailId;
	    }

	    @Override
	    public String toString() {
	        return "Student [rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + ", emailId=" + emailId + "]";
	    }

}
