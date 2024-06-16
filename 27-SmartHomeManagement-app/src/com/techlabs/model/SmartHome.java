package com.techlabs.model;

import java.util.ArrayList;

public class SmartHome {
    private ArrayList<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void controlDevice(String deviceId, boolean turnOn) {
        for (SmartDevice device : devices) {
            if (device.getdeviceId().equals(deviceId) && device instanceof Controllable) {
                Controllable controllable = (Controllable) device;
                if (turnOn) {
                    controllable.turnOn();
                    System.out.println(device.getName() + " is turned ON");
                } else {
                    controllable.turnOff();
                    System.out.println(device.getName() + " is turned OFF");
                }
                return;
            }
        }
        System.out.println("Device not found or not controllable");
    }

    public void listAllDevices() {
        for (SmartDevice device : devices) {
            String status = (device.displayStatus() ? "ON" : "OFF");
            if (device instanceof Thermostat) {
                Thermostat thermostat = (Thermostat) device;
                System.out.println("Device ID: " + device.getdeviceId() + ", Name: " + device.getName() + ", Status: " + status + ", Temperature: " + thermostat.getTemperature());
            } else {
                System.out.println("Device ID: " + device.getdeviceId() + ", Name: " + device.getName() + ", Status: " + status);
            }
        }
    }
}
