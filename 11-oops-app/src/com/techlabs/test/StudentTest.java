package com.techlabs.test;

import com.techlabs.models.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student();//when info is not given to variable ,it's take default value which is given by default constructor of java
		student1.displayStudent();
		student1.initializeStudent();
		student1.displayStudent();

	}

}
