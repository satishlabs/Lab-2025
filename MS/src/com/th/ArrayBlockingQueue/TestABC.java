package com.th.ArrayBlockingQueue;

public class TestABC {
    static void main() {
        PrinterTHread pt = new PrinterTHread();
        Thread t1 = new Thread(() ->{
            try {
                pt.threadA();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        Thread t2 = new Thread(() ->{
            try {
                pt.threadB();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        Thread t3 = new Thread(() ->{
            try {
                pt.threadC();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
