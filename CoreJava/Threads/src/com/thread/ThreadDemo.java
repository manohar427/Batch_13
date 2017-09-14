package com.thread;

public class ThreadDemo {

	public static void main(String[] args) {
       
		MyThread mt = new MyThread();
		//mt.run();
		mt.start();
		
		System.out.println("Thread name:"+Thread.currentThread().getName());
		System.out.println("Thread  main ID:"+Thread.currentThread().getId());
		//[1-10]
		Thread.currentThread().setPriority(8);
		System.out.println("Main Thread Priority:"+Thread.currentThread().getPriority());
	}

}

class MyThread extends Thread{
	
	public void run() {
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("ABC");//Thread-0
		System.out.println("My Thread Priority:"+Thread.currentThread().getPriority());
		System.out.println("My Thred ID:"+Thread.currentThread().getId());
       for(int i=0;i<10;i++){
    	   System.out.println("Thread name:"+Thread.currentThread().getName()+":"+i);
       }
	}
}