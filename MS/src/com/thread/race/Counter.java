package com.thread.race;

public class Counter {
	int count =0;
	/*
	 * public void incermemt() { 
	 * count++; 
	 * }
	 */
	
	public synchronized void incermemt() {
		count++;
	}
}
