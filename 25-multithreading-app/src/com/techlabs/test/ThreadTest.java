package com.techlabs.test;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		Thread thread=Thread.currentThread();
		thread.setName("Main Thread");
		System.out.println(thread);
		
		for(int i=5;i>=0;i--)
		{
			System.out.println(thread.getName()+":"+i);
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
