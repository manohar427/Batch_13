package com.thread;

public class SleepDemo {

	public static void main(String[] args) {
        
		MThread mt = new MThread();
		mt.start();
		
		System.out.println(mt.getState());
	}

}

class MThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {

			System.out.println("I:" + i);
			try {
				Thread.sleep(1500);//
				System.out.println("Status:" + Thread.currentThread().getState());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}