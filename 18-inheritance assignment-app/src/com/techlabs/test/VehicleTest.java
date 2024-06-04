package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Car;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of cars:");
		int number=scanner.nextInt();
		scanner.nextLine();
		Car[] cars=new Car[number];
		for(int i=0;i<number;i++)
		{
			cars[i]=new Car();
			System.out.println("Enter details for car"+(i+1)+":");
			System.out.println("Company Name:");
			cars[i].setCompanyName(scanner.nextLine());
			System.out.println("Mileage:");
			cars[i].setMileage(scanner.nextDouble());
			System.out.println("Price:");
			cars[i].setPrice(scanner.nextDouble());
			scanner.nextLine();
		}
		System.out.println("\nDetails of cars:");
		for(int i=0;i<number;i++)
		{
			 System.out.println("Car " + (i + 1) + ":");
	            cars[i].display();
		}
		scanner.close();

	}

}
