package com.techlabs.model;

import java.util.ArrayList;

public class SmartHome {
    ArrayList<SmartDevice> devices = new ArrayList<SmartDevice>();

    public void addDevice(Light light) {
        devices.add(light);
    }

    public void addDevice(Thermostat thermostat) {
        devices.add(thermostat);
    }

    public void addDevice(SecurityCamera securitycamera) {
        devices.add(securitycamera);
    }

    public void controlDevice(String deviceId, boolean turnOn) {
        for (SmartDevice device : devices) {
            if (device.getdeviceId().equals(deviceId) && device instanceof Controllable) {
                Controllable controllable = (Controllable) device;
                if (turnOn) {
                    controllable.turnOn();
                    System.out.println(device.getName() + " is turned ON");
                }
                if(!turnOn){
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
            }
            if(!(device instanceof Thermostat)) {
                System.out.println("Device ID: " + device.getdeviceId() + ", Name: " + device.getName() + ", Status: " + status);
            }
        }
    }
}