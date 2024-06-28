package com.techlabs.facadePattern.model;

public class IndianMenu implements IMenu {
    @Override
    public void displayMenu() {
        System.out.println("Indian Menu: Biryani, Paneer Butter Masala, Naan, Lassi");
    }
}