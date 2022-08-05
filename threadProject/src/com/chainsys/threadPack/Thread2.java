package com.chainsys.threadPack;

public class Thread2 extends Thread{

	MyThread m2;
	
	Thread2(MyThread m2){
		this.m2 = m2;
	}
	
	public void run() {
		m2.display(5);
	}
}
