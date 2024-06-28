// HotelReception.java
package com.techlabs.facadePattern.model;

public class HotelReception {
    public IMenu getIndianMenu() {
        IHotel indianHotel = new IndianHotel();
        return indianHotel.getMenu();
    }

    public IMenu getItalianMenu() {
        IHotel italianHotel = new ItalianHotel();
        return italianHotel.getMenu();
    }

   
}
