package com.tehlabs.test;

import java.util.Scanner;
import com.techlabs.model.Light;
import com.techlabs.model.SecurityCamera;
import com.techlabs.model.SmartHome;
import com.techlabs.model.Thermostat;

public class SmartHomeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartHome smart = new SmartHome();
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Add device \n2. Control device \n3. List all devices\n4. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addDevice(scanner, smart);
                    break;
                case 2:
                    controlDevice(scanner, smart);
                    break;
                case 3:
                    smart.listAllDevices();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exit from the system");
                    break;
                default:
                    System.out.println("Invalid option  try again.");
            }
        }
        scanner.close();
    }

    private static void addDevice(Scanner scanner, SmartHome smart) {
        System.out.println("Select:\n1. Light \n2. Thermostat \n3. Security Camera");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("you selected light");
                Light light = lightSelection(scanner, new Light());
                smart.addDevice(light);
            case 2:
                System.out.println("you selected thermostat");
                Thermostat thermostat = thermostatSelection(scanner, new Thermostat());
                smart.addDevice(thermostat);
                break;
            case 3:
                System.out.println("you selected security camera");
                SecurityCamera securitycamera = securitycameraSelection(scanner, new SecurityCamera());
                smart.addDevice(securitycamera);
                break;
            default:
                System.out.println("Invalid choice, please try again.");
        }
    }

    private static void controlDevice(Scanner scanner, SmartHome smart) {
        System.out.println("Enter device ID:");
        String deviceId = scanner.next();
        System.out.println("Turn on or off? (true for on, false for off):");
        boolean turnOn = scanner.nextBoolean();
        smart.controlDevice(deviceId, turnOn);
    }

    private static Light lightSelection(Scanner scanner, Light light) {
        System.out.println("Enter Device ID:");
        light.setDeviceId(scanner.next());
        System.out.println("Enter Name:");
        light.setName(scanner.next());
        System.out.println("Enter status (true for on, false for off):");
        light.setOn(scanner.nextBoolean());
        return light;
    }

    private static Thermostat thermostatSelection(Scanner scanner, Thermostat thermostat) {
        System.out.println("Enter Device ID:");
        thermostat.setDeviceId(scanner.next());
        System.out.println("Enter Name:");
        thermostat.setName(scanner.next());
        System.out.println("Enter status (true for on, false for off):");
        thermostat.setOn(scanner.nextBoolean());
        System.out.println("Enter Temperature:");
        thermostat.setTemperature(scanner.nextDouble());
        return thermostat;
    }

    private static SecurityCamera securitycameraSelection(Scanner scanner, SecurityCamera securitycamera) {
        System.out.println("Enter Device ID:");
        securitycamera.setDeviceId(scanner.next());
        System.out.println("Enter Name:");
        securitycamera.setName(scanner.next());
        System.out.println("Is recording? (true for yes, false for no):");
        securitycamera.setRecording(scanner.nextBoolean());
        return securitycamera;
    }
}
