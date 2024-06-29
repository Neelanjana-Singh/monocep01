package com.techlabs.test;

import com.techlabs.model.Addition;
import com.techlabs.model.IAddition2;

public class ConstructorTest {
    public static void main(String[] args) {
        
        System.out.println(sum((a, b) -> new Addition(a, b)).getSum());
    }

    private static Addition sum(IAddition2 adder) {
        return adder.create(70, 30);
    }
}
