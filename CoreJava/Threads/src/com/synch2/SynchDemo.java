package com.synch2;

public class SynchDemo {

	public static void main(String[] args) {

		Th1 t1 = new Th1();

		Th2 t2 = new Th2();

		t1.start();
		t2.start();

	}

}

class Th1 extends Thread {

	public void run() {
		try {
			Bank.doTransfer();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Th2 extends Thread {
	

	public void run() {
		try {
			Bank.doTransfer();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Bank {
	 
	 
	public synchronized static void doTransfer() throws InterruptedException {
		System.out.println("Before Begin Transaction");

			System.out.println("Begin Transaction");
			Thread.sleep(4000);
			System.out.println("End Transaction");
		
		System.out.println("Before End Transaction");
		
	}
}