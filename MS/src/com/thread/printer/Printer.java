package com.thread.printer;
//A B C
public class Printer {
	private int flag=0;
	public void printerA() {
		for(int i=0; i<5; i++) {
			synchronized (this) {
				try {
					while(flag%3 !=0) {
						wait();	
					}
				}catch (InterruptedException e) {
					// TODO: handle exception
				}
				System.out.print("A ");
				flag++;
				notifyAll();
			}
		}
	}
	
	public void printerB() {
		for(int i=0; i<5; i++) {
			synchronized (this) {
				try {
					while(flag%3 != 1) {
						wait();
					}
				}catch (InterruptedException e) {
					// TODO: handle exception
				}
				System.out.print("B ");
				flag++;
				notifyAll();
			}
		}
	}
	
	public void printerC() {
		for(int i=0; i<5; i++) {
			synchronized (this) {
				try {
					while(flag%3 != 2) {
						wait();
					}
				}catch (InterruptedException e) {
					// TODO: handle exception
				}
				System.out.print("C ");
				flag++;
				notifyAll();
			}
		}
	}
}
