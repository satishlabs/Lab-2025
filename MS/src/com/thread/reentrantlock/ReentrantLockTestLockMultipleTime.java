package com.thread.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTestLockMultipleTime {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        MyRunnable4 myRunnable4 = new MyRunnable4(lock);
        new Thread(myRunnable4, "Thread -1").start();
        new Thread(myRunnable4, "Thread -2").start();
    }
}
