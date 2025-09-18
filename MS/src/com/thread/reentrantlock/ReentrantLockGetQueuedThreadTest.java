package com.thread.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockGetQueuedThreadTest {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        MyRunnable2 myRunnable2 = new MyRunnable2(lock);
        new Thread(myRunnable2, "Thread-1").start();
        new Thread(myRunnable2, "Thread-2").start();
        new Thread(myRunnable2, "Thread-3").start();
    }
}
