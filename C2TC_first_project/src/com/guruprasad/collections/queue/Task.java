package com.guruprasad.collections.queue;

public class Task implements Comparable<Task> {
private String name;
private int priority;


public Task (String name, int priority) {
	this.name = name;
	this.priority = priority;
	
}
public String getName() {
	return name;
}

public void setPriority(int priority) {
	this.priority = priority;
}

public int compareTo(Task o) {
	
	return Integer.compare(o.priority, this.priority);
	
}


}
