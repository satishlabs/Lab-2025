package com.thread.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTryLockTest {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        MyRunnable1 myRunnable1 = new MyRunnable1(lock);
        new Thread(myRunnable1, "Thread-1").start();
        new Thread(myRunnable1, "Thread-2").start();
    }
}
