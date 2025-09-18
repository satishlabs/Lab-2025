package com.test;

public class PrinterThread {
	public static void main(String[] args) {
		ABCTest abcTest = new ABCTest();
		
		Thread t1 = new Thread(() ->{
			try {
				abcTest.threadA();
			}catch (InterruptedException e) {
				// TODO: handle exception
			}
		});
				
		Thread t2 = new Thread(() ->{
			try {
				abcTest.threadB();
			}catch (InterruptedException e) {
				// TODO: handle exception
			}		
		});
		
		Thread t3 = new Thread(() ->{
			try {
				abcTest.threadC();
			}catch (InterruptedException e) {
				// TODO: handle exception
			}		
		});
		
		t1.start();
		t2.start();
		t3.start();
	}
}


