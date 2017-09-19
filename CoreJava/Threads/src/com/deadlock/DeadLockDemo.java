package com.deadlock;

public class DeadLockDemo {

	public static void main(String[] args) {

		Lock1 l1 = new Lock1();
		Lock2 l2 = new Lock2();
		
		Th1 t1 = new Th1(l1,l2);
		Th2 t2 = new Th2(l1,l2);
		t1.start();
		t2.start();
		
	}

}
class Th1 extends Thread{
	
	Lock1 l1;
	Lock2 l2;
	
	public Th1(Lock1 l1, Lock2 l2) {
		this.l1 = l1;
		this.l2 = l2;
	}
	
	public void run() {
       synchronized (l1) {
    	   System.out.println("Thread 1 is holding Lock1");
    	   
    	   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
    	   synchronized (l2) {
    		   System.out.println("Thread 1 is holding Lock2 and Lock 1");
    	   }
	}
       
       //l1 & l2
	}
}

class Th2 extends Thread{
	
	Lock1 l1;
	Lock2 l2;
	
	public Th2(Lock1 l1, Lock2 l2) {
		this.l1 = l1;
		this.l2 = l2;
	}

	public void run() {
       synchronized (l2) {
    	   System.out.println("Thread 1 is holding Lock2");
    	   
    	   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
    	   synchronized (l1) {
    		   System.out.println("Thread 1 is holding Lock1 and Lock 2");
    	   }
	}
       
       //l1 & l2
	}
}