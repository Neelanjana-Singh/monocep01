package com.techlabs.prototype.test;

import com.techlabs.prototype.model.Shape;
import com.techlabs.prototype.model.ShapeCache;

public class ShapeTest {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        
        Shape clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape 1 Type: " + clonedShape1.getType());

        
        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape 2 Type: " + clonedShape2.getType());
    }
}
