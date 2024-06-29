package com.techlabs.facadePattern.model;

public class ItalianHotel implements IHotel {
    @Override
    public IMenu getMenu() {
        return new ItalianMenu();
    }
}
