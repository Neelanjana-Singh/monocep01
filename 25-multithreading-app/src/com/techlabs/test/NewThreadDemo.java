package com.techlabs.test;

import com.techlabs.model.MyThread;

public abstract class NewThreadDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyThread thread1=new MyThread("mythread1");
		MyThread thread2=new MyThread("mythread2");
		MyThread thread3=new MyThread("mythread3");

	}

}
