package com.capgemini;

public class MyThread1 implements  Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" Implements Runnable");
    }

    static void main(String[] args) {
        MyThread1 obj = new MyThread1();
        Thread t1 = new Thread(obj);
            t1.run();
        //t1.start();
    }
}
