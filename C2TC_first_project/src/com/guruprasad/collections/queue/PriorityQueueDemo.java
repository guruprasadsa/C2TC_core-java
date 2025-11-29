package com.guruprasad.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
			Queue<String> pq = new PriorityQueue<String>();
			
			pq.add("Core Java");
			pq.add("Python");
			pq.add("C++");
			pq.add("R");
			pq.add("HTML");
			
			System.out.println(pq);
			pq.remove();
			System.out.println(pq);
	}

}
