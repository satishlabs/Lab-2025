package com.test2;

public class Test {
	static Object obj1 = new Object();
	static Object obj2 = new Object();
	
	public static void main(String[] args) {
	
		Thread t1 = new Thread(() ->{
			synchronized(obj1) {
				System.out.println("T1 : hold lock obj1");
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					// TODO: handle exception
				}
				synchronized(obj2) {
					System.out.println("T1 try to get the object lock obj1");
				}
			}
		});
		
		Thread t2 =new Thread(() ->{
			synchronized(obj2) {
				System.out.println("T2 : hold lock obj2");
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					// TODO: handle exception
				}
				synchronized(obj1) {
					System.out.println("T2 try to get the object lock obj1");
				}
			}
		});
		
		t1.start();
		t2.start();
	}
	
}
