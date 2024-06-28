package com.techlabs.model;

public class NewThread implements Runnable{
	public Thread thread;

   public NewThread(String name)
   {
	   this.thread=new Thread(this,name);
	   thread.start();
   }

   @Override
   public void run() {
	for(int i=3;i>0;i--)
	{
		System.out.println(Thread.currentThread().getName()+ ":"+i);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    }
   

}
