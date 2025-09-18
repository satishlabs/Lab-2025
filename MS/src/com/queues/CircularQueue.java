package com.queues;

public class CircularQueue {
	private int[] data;
	private int front, rear, size;
	
	public CircularQueue(int capacity) {
		data = new int[capacity];
		front = 0;
		rear = 0;
		size = 0;
	}
	
	 public boolean enqueue(int value) {
	        if (size == data.length) return false; // full
	        data[rear] = value;
	        rear = (rear + 1) % data.length;
	        size++;
	        return true;
	    }

	    public Integer dequeue() {
	        if (size == 0) return null; // empty
	        int result = data[front];
	        front = (front + 1) % data.length;
	        size--;
	        return result;
	    }

	    public void printQueue() {
	        for (int i = 0; i < size; i++) {
	            int index = (front + i) % data.length;
	            System.out.print(data[index] + " ");
	        }
	        System.out.println();
	    }
}
