package com.thread.deadlock;

public class DeadLockSolution {
    public static void main(String[] args) {
        Thread t1 = new Thread(new AA(), "Thread-1");
        Thread t2 = new Thread(new BB(), "Thread-2");
        t1.start();
        t2.start();
    }
}
