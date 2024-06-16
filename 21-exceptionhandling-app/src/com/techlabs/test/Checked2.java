package com.techlabs.test;

public class Checked2 {
    public static void main(String[] args) {
        try {
            loadClass("com.techlabs.nonexistent.ClassName");
           // loadClass("com.techlabs.test.Checked2");
            System.out.println("Class loaded successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " );
        }
    }

    public static void loadClass(String className) throws ClassNotFoundException {
        // Attempt to load the class with the specified name
        Class.forName(className);
    }
}
