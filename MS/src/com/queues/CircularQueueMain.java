package com.queues;

public class CircularQueueMain {
	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.dequeue(); //removes 1
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6); //wraps around
		q.printQueue();
	}
}
