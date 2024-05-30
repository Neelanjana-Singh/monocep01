package com.techlabs.test;

import com.techlabs.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1=new Employee();
	      System.out.println("Details of employee1:");
	      System.out.println("Employee Id:"+employee1.getId());
	      System.out.println("Name:"+employee1.getName());
	      System.out.println("Employee Salary:"+employee1.getSalary());
	      System.out.println();
	      employee1.setId(490);
	      employee1.setName("Ram");
	      employee1.setSalary(600000);
	      System.out.println("Details of employee1 after modification:");
	      System.out.println("Employee Id:"+employee1.getId());
	      System.out.println("Name:"+employee1.getName());
	      System.out.println("Employee Salary:"+employee1.getSalary());
	      System.out.println();
	      
	      Employee employee2=new Employee(employee1);
	      System.out.println("Details of employee2:");
	      System.out.println("Employee Id:"+employee2.getId());
	      System.out.println("Name:"+employee2.getName());
	      System.out.println("Employee Salary:"+employee2.getSalary());
	      System.out.println();
	      
	      Employee employee3=new Employee(234,"Shivam",800000);
	      System.out.println("Details of employee3:");
	      System.out.println("Employee Id:"+employee3.getId());
	      System.out.println("Name:"+employee3.getName());
	      System.out.println("Employee Salary:"+employee3.getSalary());
	      
	}

}
