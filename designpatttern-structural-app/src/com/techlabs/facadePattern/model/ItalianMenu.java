package com.techlabs.facadePattern.model;

public class ItalianMenu implements IMenu {
    @Override
    public void displayMenu() {
        System.out.println("Italian Menu: Pizza, Pasta, Risotto, Tiramisu");
    }
}