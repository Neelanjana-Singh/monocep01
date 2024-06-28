package com.techlabs.test;

import com.techlabs.model.Caller;
import com.techlabs.model.Callme;

public class CallTest {

	public static void main(String[] args) {
		Callme target=new Callme();
		
		Caller caller1=new Caller("Hello",target);
		Caller caller2=new Caller("sneha",target);
		Caller caller3=new Caller("welcome",target);
		
		try {
			caller1.thread.join();
			caller2.thread.join();
			caller3.thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
