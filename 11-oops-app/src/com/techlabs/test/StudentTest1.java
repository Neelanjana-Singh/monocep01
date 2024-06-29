package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.models.Student1;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 student1=new Student1();
		student1.displayStudent();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter details of first student:");
		System.out.println("Enter Roll number:");
		int rollnumber=scanner.nextInt();
		System.out.println("Enter Name:");
		String name=scanner.next();
		System.out.println("Enter Age:");
		int age=scanner.nextInt();
		student1.initializeStudent(rollnumber,name,age);
		student1.displayStudent();
		
		
		Student1 student2=new Student1();
		//student2.displayStudent();
		System.out.println("Enter details of second student:");
		System.out.println("Enter Roll number:");
		rollnumber=scanner.nextInt();
		System.out.println("Enter Name:");
		name=scanner.next();
		System.out.println("Enter Age:");
	    age=scanner.nextInt();
		student2.initializeStudent(rollnumber,name,age);
		student2.displayStudent();
		
		scanner.close();

	}

}
