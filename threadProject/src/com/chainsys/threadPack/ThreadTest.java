package com.chainsys.threadPack;

public class ThreadTest {

	public static void main(String[] args) {

		MyThread mt = new MyThread();
		Thread1 th1 = new Thread1(mt);
		Thread2 th2 = new Thread2(mt);
		try {
			th1.start();
			th2.start();
			System.out.println(th1.getName());
			System.out.println(th1.isAlive());
			System.out.println(th1.isInterrupted());
			System.out.println(th1.getPriority());
			System.out.println(th2.getName());
			System.out.println(th2.isAlive());
			System.out.println(th2.isInterrupted());
			System.out.println(th2.getPriority());
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
