package com.techlabs.test;

import com.techlabs.model.MyThread;

public class ThreadDemoTest {

    public static void main(String[] args) {
    	//System.out.println(Thread.currentThread().getName());
        MyThread thread1 = new MyThread("mythread1");
       // thread1.start();
        
//        System.out.println(thread1.isAlive());
//        System.out.println(Thread.currentThread().getName());
        MyThread thread2 = new MyThread("mythread2");
        MyThread thread3 = new MyThread("mythread3");
        
        for (int i = 3; i > 0; i--) {
            //System.out.println("name :" + i);
            System.out.println(Thread.currentThread().getName()+ ":"+i);
            try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
        
        
    }

