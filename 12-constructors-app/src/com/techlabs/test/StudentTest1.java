package com.techlabs.test;

import com.techlabs.model.Student1;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student1 student1=new Student1();
	      System.out.println("Details of student1:");
	      System.out.println("Roll number:"+student1.getRollNumber());
	      System.out.println("Name:"+student1.getName());
	      System.out.println("Age:"+student1.getAge());
	      System.out.println();
	      student1.setRollNumber(49);
	      student1.setName("Ram");
	      student1.setAge(25);
	      System.out.println("Details of student1:");
	      System.out.println("Roll number:"+student1.getRollNumber());
	      System.out.println("Name:"+student1.getName());
	      System.out.println("Age:"+student1.getAge());
	      student1.setRollNumber(49);
	      System.out.println();
	      
	      Student1 student2=new Student1(student1);
	      System.out.println("Details of student2:");
	      System.out.println("Roll number:"+student2.getRollNumber());
	      System.out.println("Name:"+student2.getName());
	      System.out.println("Age:"+student2.getAge());
	      
	      
	      Student1 student3=new Student1(68,"Sahil",25);
	      System.out.println("Details of student3:");
	      System.out.println("Roll number:"+student3.getRollNumber());
	      System.out.println("Name:"+student3.getName());
	      System.out.println("Age:"+student3.getAge());
	      System.out.println();

	}

}
