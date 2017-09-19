package com.thread;

public class YieldDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread3 t = new MyThread3();
		
		t.start();
		
		//Thread.yield();
		   t.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread3 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyThread3:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}