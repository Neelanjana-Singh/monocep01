package com.techlabs.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream=new FileInputStream ("E:\\Java Training\\10-stream-app\\src\\com\\techlabs\\file\\demo.txt");
		    int ch;
		    while((ch =fileInputStream.read())!=-1)
		    {
		    	System.out.print((char)ch);
		    }
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
