package com.techlabs.test;

import com.techlabs.model.ITester;

public class Tester {

    public static void main(String[] args) {
        ITester tester = new ITester() {

            @Override
            public void test1() {
                System.out.println("Testing 1.......");
            }

            @Override
            public void test2() {
                System.out.println("Testing 2.......");
            }
        };

        // Call the methods to see the output
        tester.test1();
        tester.test2();
    }
}
