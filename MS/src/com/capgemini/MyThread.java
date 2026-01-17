package com.capgemini;

public class MyThread extends  Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" MyThread");
    }

    static void main() {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
