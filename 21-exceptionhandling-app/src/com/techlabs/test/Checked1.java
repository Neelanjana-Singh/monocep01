package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Checked1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
        	
            readFile("E:\\Java Training\\21-exceptionhandling-app\\src\\com\\techlabs\\test\\checked");
        } catch (FileNotFoundException e) {
          
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file");
        }
    }

    public static void readFile(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int ch;
        
        
        for (int i = 0; i < 5 && (ch = fileInputStream.read()) != -1; i++) {
            System.out.print((char) ch);
        }
        
        fileInputStream.close();

        ch = fileInputStream.read(); //attempt to read from closed stream
        System.out.print((char) ch);  

        fileInputStream.close();
    }
}
