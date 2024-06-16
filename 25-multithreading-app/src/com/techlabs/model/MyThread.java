package com.techlabs.model;

public class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        super(name);
        this.name = name;
        start();
    }

    @Override
    public void run() {
        for (int i = 3; i > 0; i--) {
            //System.out.println("name :" + i);
            System.out.println(Thread.currentThread().getName()+ ":"+i);
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }

}