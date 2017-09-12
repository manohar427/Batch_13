package com.list;

import java.util.PriorityQueue;

public class PqDemo {

	public static void main(String[] args) {
       PriorityQueue pq = new PriorityQueue();
       
       pq.add(345);
       pq.add(4567);
       pq.add(5);
       
       System.out.println(pq.peek());
       System.out.println(pq.poll());
       System.out.println(pq.poll());
       System.out.println(pq.poll());
	}

}
