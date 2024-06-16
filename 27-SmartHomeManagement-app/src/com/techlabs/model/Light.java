package com.techlabs.model;

public class Light implements SmartDevice, Controllable {
    public String deviceId;
    public String name;
    public boolean on;

    public Light() {
        super();
    }

    public Light(String deviceId, String name, boolean on) {
        this.deviceId = deviceId;
        this.name = name;
        this.on = on;
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

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
