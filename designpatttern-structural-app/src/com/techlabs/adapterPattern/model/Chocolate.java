package com.techlabs.adapterPattern.model;

public class Chocolate implements IItems {
 private String name;
 private double mrp;

 public Chocolate(String name, double mrp) {
     this.name = name;
     this.mrp = mrp;
 }

 @Override
 public String getItemName() {
     return name;
 }

 @Override
 public double getItemPrice() {
     return mrp;
 }

 
 public void setName(String name) {
     this.name = name;
 }

 public void setMrp(double mrp) {
     this.mrp = mrp;
 }
}

