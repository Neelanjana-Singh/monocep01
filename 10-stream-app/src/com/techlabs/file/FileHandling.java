package com.techlabs.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling {
@SuppressWarnings("resource")
	public static void main(String[] args) {
	int countLetters=0;
    int countWords=0;
    int countLines=0;
		try {
			
			FileInputStream fileInputStream=new FileInputStream ("E:\\Java Training\\10-stream-app\\src\\com\\techlabs\\file\\demo.txt");
		    int ch;
		    
		    while((ch =fileInputStream.read())!=-1)
		    {
		    	char currentChar=(char)ch;
		    	if((currentChar>='A' & currentChar<='Z')||(currentChar>='a' & currentChar<='z'))
		    	{
		    		countLetters++;
		    	}
		    	else if(currentChar==' ')
		    	{
		    		countLetters++;
		    		countWords++;
		    	}
		    	else if(currentChar=='\n')
		    	{
		    		countLines++;
		    	}
		    	else
		    	{
		    		countLetters++;
		    	}
		    }
		}
		
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total word count:"+countWords);
		System.out.println("Total character count:"+countLetters);
		System.out.println("Total line count:"+countLines);
		

	}

}
