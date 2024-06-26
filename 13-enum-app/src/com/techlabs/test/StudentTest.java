package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of students:");
	        int n = scanner.nextInt();

	        Student[] students = new Student[n];

	        for (int i = 0; i < n; i++) {
	            students[i] = new Student();
	            System.out.println("Enter Roll Number for student " + (i + 1) + ":");
	            students[i].setRollNumber(scanner.nextInt());
	            System.out.println("Enter Name for student " + (i + 1) + ":");
	            students[i].setName(scanner.next());
	            System.out.println("Enter Age for student " + (i + 1) + ":");
	            students[i].setAge(scanner.nextInt());
	            System.out.println("Enter Email ID for student " + (i + 1) + ":");
	            students[i].setEmailId(scanner.next());
	        }

	        System.out.println("\nStudent Details:");
	        for (Student student : students) {
	            System.out.println(student);
	        }

	        scanner.close(); // 

	}

}
