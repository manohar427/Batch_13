package com.synch;

public class SynchDemo {

	public static void main(String[] args) {

		Bank b = new Bank();
		Th1 t1 = new Th1(b);

		Th2 t2 = new Th2(b);

		t1.start();
		t2.start();

	}

}

class Th1 extends Thread {
	Bank bank;

	public Th1(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		try {
			bank.doTransfer();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Th2 extends Thread {
	Bank bank;

	public Th2(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		try {
			bank.doTransfer();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Bank {
	// Account account;

	/*
	 * public Bank(Account account) { this.account = account; }
	 */
	public synchronized void doTransfer() throws InterruptedException {
		System.out.println("Begin Transaction");

		Thread.sleep(4000);

		System.out.println("End Transaction");
	}
}