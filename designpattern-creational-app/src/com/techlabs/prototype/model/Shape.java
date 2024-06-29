package com.techlabs.prototype.model;

public interface Shape extends Cloneable {
    void draw();
    Shape clone();
	String getType();
}