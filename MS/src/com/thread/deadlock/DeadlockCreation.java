package com.thread.deadlock;

public class DeadlockCreation {
    public static void main(String[] args) {
        Thread t1 = new Thread(new A(), "Thread-1");
        Thread t2 = new Thread(new B(), "Thread-2");
        t1.start();
        t2.start();
    }
}
