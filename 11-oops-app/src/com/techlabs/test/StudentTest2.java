package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.models.Student2;

public class StudentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student2 student1=new Student2();
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter Details of first student:");
      System.out.println("Enter Roll Number:");
      int rollnumber=scanner.nextInt();
      student1.setRollNumber(rollnumber);
      System.out.println("Enter Name:");
      String name=scanner.next();
      student1.setName(name);
      System.out.println("Enter age:");
      int age=scanner.nextInt();
      student1.setAge(age);
      
      System.out.println("Student1 details");
      System.out.println("Roll Number:"+student1.getRollNumber());
      System.out.println("Name:"+student1.getName());
      System.out.println("Age:"+student1.getAge());
      
      Student2 student2=new Student2();
      
      System.out.println("Enter Details of second student:");
      System.out.println("Enter Roll Number:");
      rollnumber=scanner.nextInt();
      student2.setRollNumber(rollnumber);
      System.out.println("Enter Name:");
      name=scanner.next();
      student2.setName(name);
      System.out.println("Enter age:");
      age=scanner.nextInt();
      student2.setAge(age);
      
      System.out.println("Student2 details");
      System.out.println("Roll Number:"+student2.getRollNumber());
      System.out.println("Name:"+student2.getName());
      System.out.println("Age:"+student2.getAge());
      scanner.close();
	}

}
