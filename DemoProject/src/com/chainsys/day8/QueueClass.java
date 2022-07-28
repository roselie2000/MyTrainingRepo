package com.chainsys.day8;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {

	public void queue() {
		PriorityQueue<Integer> queueList = new PriorityQueue<>();
		queueList.add(10);
		queueList.add(20);
		queueList.add(5);
		System.out.println(queueList);
		queueList.poll();
		System.out.println(queueList);
		System.out.println(queueList.hashCode());
		System.out.println(queueList.offer(4));
		System.out.println(queueList);
		System.out.println(queueList.offer(5));
		System.out.println(queueList);
		PriorityQueue<Employee> list = new PriorityQueue<>();
		
//		list.add(e);
	}
}
