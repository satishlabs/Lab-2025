package com.thread.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        MyRunnable myRunnable = new MyRunnable(lock);
        new Thread(myRunnable, "Thread-1").start();
        new Thread(myRunnable, "Thread-2").start();
    }
}
