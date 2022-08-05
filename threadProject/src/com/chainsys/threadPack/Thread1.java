package com.chainsys.threadPack;

public class Thread1 extends Thread{

	MyThread m1;
	
	Thread1(MyThread m1){
		this.m1 = m1;
	}
	
	public void run() {
		m1.display(5);
	}
}
