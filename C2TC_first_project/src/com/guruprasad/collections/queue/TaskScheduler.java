package com.guruprasad.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TaskScheduler {

	public static void main(String[] args) {
		PriorityQueue<Task> pq =new PriorityQueue<>();
		
		//Different priority tasks
		
		pq.add(new Task("Task 1",3));
		pq.add(new Task("Task 2",5));
		pq.add(new Task("Task 3",2));
		pq.add(new Task("Task 4",1));
		pq.add(new Task("Task 5",4));
		
		Iterator i = pq.iterator();
		while (i.hasNext()) {
			Task t = (Task) i.next();
			System.out.println(t.getName());
			System.out.println(" ");
			System.out.println(t.getPriority());
		}
		while (!pq.isEmpty()) {
			Task t = pq.poll();
			System.out.println("Processing task"+ t.getName()+" ");
		}
		
	}

}
