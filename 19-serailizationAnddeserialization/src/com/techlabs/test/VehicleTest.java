package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.techlabs.model.Car;

public class VehicleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cars: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Car[] cars = new Car[n];

        for (int i = 0; i < n; i++) {
            cars[i] = new Car();

            System.out.println("Enter details for car " + (i + 1) + ":");
            System.out.print("Company Name: ");
            cars[i].setCompanyName(scanner.nextLine());
            System.out.print("Mileage: ");
            cars[i].setMileage(scanner.nextDouble());
            System.out.print("Price: ");
            cars[i].setPrice(scanner.nextDouble());
            scanner.nextLine(); // Consume newline
        }

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E:\\Java Training\\19-serailizationAnddeserialization\\src\\com\\techlabs\\test\\vehicle.txt"))) {
            out.writeObject(cars);
            System.out.println("Serialization successful.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\Java Training\\19-serailizationAnddeserialization\\src\\com\\techlabs\\test\\vehicle.txt"))) {
            Car[] deserializedCars = (Car[]) in.readObject();

            System.out.println("\nDeserialized details of cars:");
            for (int i = 0; i < deserializedCars.length; i++) {
                System.out.println("\nCar " + (i + 1) + ":");
                deserializedCars[i].display();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
