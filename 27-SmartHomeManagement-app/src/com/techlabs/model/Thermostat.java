package com.techlabs.model;

public class Thermostat implements SmartDevice, Controllable, Monitorable {
    public String deviceId;
    public String name;
    public boolean on;
    public double temperature;

    public Thermostat() {
        super();
    }

    public Thermostat(String deviceId, String name, boolean on, double temperature) {
        this.deviceId = deviceId;
        this.name = name;
        this.on = on;
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getdeviceId() {
        return deviceId;
    }

    @Override
    public boolean displayStatus() {
        return on;
    }

    @Override
    public void turnOn() {
        this.on = true;
    }

    @Override
    public void turnOff() {
        this.on = false;
    }

    @Override
    public String getStatus() {
        return "Temperature: " + temperature;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isOn() {
        return on;
    }

    public double getTemperature() {
        return temperature;
    }
}