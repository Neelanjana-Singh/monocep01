package com.techlabs.compositePattern.model;

public class Manager implements IEmployee {
    private String name;
    private String position;

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Manager [Name=" + name + ", Position=" + position + "]";
    }
}
