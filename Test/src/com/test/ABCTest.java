package com.test;

public class ABCTest {
	private int flag = 0;
	public void threadA() throws InterruptedException {
		for(int i=0; i<10; i++) {
			synchronized (this) {
				while(flag%3 != 0) {
					wait();
				}
				System.out.print("A ");
				flag++;
				notifyAll();
			}
		}
	}
	
	public void threadB() throws InterruptedException {
		for(int i=0; i<10; i++) {
			synchronized (this) {
				while(flag%3 != 1) {
					wait();
				}
				System.out.print("B ");
				flag++;
				notifyAll();
			}
		}
	}
	
	public void threadC() throws InterruptedException {
		for(int i=0; i<10; i++) {
			synchronized (this) {
				while(flag%3 != 2) {
					wait();
				}
				System.out.print("C ");
				flag++;
				notifyAll();
			}
		}
	}
}
