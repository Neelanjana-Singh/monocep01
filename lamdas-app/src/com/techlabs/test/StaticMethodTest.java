package com.techlabs.test;

import com.techlabs.model.IAddition;

public class StaticMethodTest {

    public static void main(String[] args) {
        
        System.out.println(fun((a, b) -> staticAdd(a, b)));
    }

   
    public static int staticAdd(int a, int b) {
        return a + b;
    }

    private static int fun(IAddition adder) {
        return adder.add(25, 30);
    }
}
