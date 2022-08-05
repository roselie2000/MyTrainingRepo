package com.chainsys.threadPack;

public class MyThread extends Thread {
	public void display(int n) {
		try {
			for(int i=0; i<n; i++) {
				System.out.println((i * 2) + 100);
				try {
					Thread.sleep(2000);
				}
				catch (Exception e) {
					System.out.println(e);
				}
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
