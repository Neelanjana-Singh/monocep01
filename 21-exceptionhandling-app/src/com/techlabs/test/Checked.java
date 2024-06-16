package com.techlabs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Checked {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try {
            readFile("example.txt");
           // readFile("E:\\Java Training\\21-exceptionhandling-app\\src\\com\\techlabs\\test\\checked");
        } catch (FileNotFoundException e) {
            System.out.println("File not found " );
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " );
        }
    }

    public static void readFile(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int ch;
        while ((ch = fileInputStream.read()) != -1) {
            System.out.print((char) ch);
        }
        fileInputStream.close();
    }
}
