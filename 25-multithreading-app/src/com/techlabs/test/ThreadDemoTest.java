package com.techlabs.test;

import com.techlabs.model.MyThread;

public class ThreadDemoTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Thread.currentThread().setPriority(1);
		
		MyThread thread1=new MyThread("mythread1");
		MyThread thread2=new MyThread("mythread2");
		MyThread thread3=new MyThread("mythread3");
		
		thread1.setPriority(2);
		thread2.setPriority(9);
		thread1.setPriority(Thread.NORM_PRIORITY);
		
		for(int i=3;i>0;i--)
		{
			System.out.println(Thread.currentThread().getName()+ ":"+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
