package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.models.Employee1;


public class EmployeeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 employee1=new Employee1();
		employee1.displayEmployee();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter details of first employee:");
		System.out.println("Enter Employee id:");
		int id=scanner.nextInt();
		System.out.println("Enter Employee Name:");
		String name=scanner.next();
		System.out.println("Enter Employee Salary:");
		double salary=scanner.nextInt();
		employee1.initializeEmployee(id,name,salary);
		employee1.displayEmployee();
		
		Employee1 employee2=new Employee1();
		System.out.println("Enter details of second employee:");
		System.out.println("Enter Employee id:");
	    id=scanner.nextInt();
		System.out.println("Enter Employee Name:");
		name=scanner.next();
		System.out.println("Enter Employee Salary:");
		salary=scanner.nextInt();
		employee2.initializeEmployee(id,name,salary);
		employee2.displayEmployee();
		scanner.close();

	}

}
