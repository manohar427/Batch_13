package com.thread;

import java.util.Date;

public class WaitDemo {

	public static void main(String[] args) {

		Message m = new Message("My Message");

		Waiter w1 = new Waiter(m);
		w1.start();

		Waiter w2 = new Waiter(m);
		w2.start();

		Waiter w3 = new Waiter(m);
		w3.start();

		Notifier n = new Notifier(m);
		n.start();
	}

}

class Message {
	String name;

	public Message(String name) {
		this.name = name;
	}
}

class Waiter extends Thread {

	Message message;

	public Waiter(Message message) {
		this.message = message;
	}

	public void run() {
		System.out.println("waiter name:" + Thread.currentThread().getName());

		System.out.println(" waiter waiting Started at :" + new Date().getTime());

		synchronized (message) {
			try {
				message.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(" Restarting waiter at :" + new Date().getTime());

	}
}

class Notifier extends Thread {

	Message message;

	public Notifier(Message message) {
		this.message = message;
	}

	public void run() {
		System.out.println("Notifier name:" + Thread.currentThread().getName());

		System.out.println(" Notifier Notification  Started at :" + new Date().getTime());

		synchronized (message) {
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// message.notify();
			message.notifyAll();
		}

		System.out.println(" Notifier Notification is done at  :" + new Date().getTime());

	}
}
