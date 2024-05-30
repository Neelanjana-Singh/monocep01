package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.models.Employee2;

public class EmployeeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 employee1=new Employee2();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter details of first employee");
		System.out.println("Enter employee id:");
		int id=scanner.nextInt();
		employee1.setId(id);
		System.out.println("Enter employee Name:");
		String name=scanner.next();
		employee1.setName(name);
		System.out.println("Enter employee Salary:");
		int salary=scanner.nextInt();
		employee1.setSalary(salary);
		
		System.out.println("Details of first employee");
		System.out.println("Employee id:"+employee1.getId());
		System.out.println("Employee name:"+employee1.getName());
		System.out.println("Employee salary:"+employee1.getSalary());
		System.out.println();
		
		Employee2 employee2=new Employee2();
		
		System.out.println("Enter details of second employee");
		System.out.println("Enter employee id:");
		id=scanner.nextInt();
		employee2.setId(id);
		System.out.println("Enter employee Name:");
	    name=scanner.next();
		employee2.setName(name);
		System.out.println("Enter employee Salary:");
		salary=scanner.nextInt();
		employee2.setSalary(salary);
		
		System.out.println("Details of second employee");
		System.out.println("Employee id:"+employee2.getId());
		System.out.println("Employee name:"+employee2.getName());
		System.out.println("Employee salary:"+employee2.getSalary());
		
		scanner.close();
		

	}

}
