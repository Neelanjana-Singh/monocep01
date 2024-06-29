package com.techlabs.adapterPattern.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
 private List<IItems> cartItems;

 public ShoppingCart() {
     cartItems = new ArrayList<>();
 }

 public void addItemsToCart(List<IItems> items) {
     cartItems.addAll(items);
 }

 public List<IItems> getCartItems() {
     return cartItems;
 }

 public double getCartPrice() {
     double totalPrice = 0;
     for (IItems item : cartItems) {
         totalPrice += item.getItemPrice();
     }
     return totalPrice;
 }

 public void displayCart() {
     System.out.println("Item Name\tPrice");
     for (IItems item : cartItems) {
         System.out.printf("%-10s\t%.2f\n", item.getItemName(), item.getItemPrice());
     }
     System.out.printf("Total Price:\t%.2f\n", getCartPrice()); // Display total price in the same format
 }
}
