package com.techlabs.test;

import java.lang.reflect.Method;

public class Checked3 {
    public void display() {
        System.out.println("display the message");
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.techlabs.test.Checked3");
            
            Checked3 obj = (Checked3) clazz.newInstance(); 
//            Method method1 = clazz.getMethod("display");
//            method1.invoke(obj1);
            
            Method method2 = clazz.getMethod("play");
            method2.invoke(obj);

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found" );
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found" );
        } catch (Exception e) {
            System.out.println("An error occurred" );
        }
    }
}
