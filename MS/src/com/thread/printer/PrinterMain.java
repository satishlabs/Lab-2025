package com.thread.printer;

public class PrinterMain {
	public static void main(String[] args) throws InterruptedException {
		Printer printer = new Printer();
		
		Thread t1 = new Thread(() ->{
			printer.printerA();
		});
		
		Thread t2 = new Thread(() ->{
			printer.printerB();
		});
		
		Thread t3 = new Thread(() ->{
			printer.printerC();
		});
		
		t1.start();
		t2.start();
		t3.start();
	}
}
