package com.thread.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadLockTest {
    public static void main(String[] args) {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        MyRunnable myRunnable = new MyRunnable(readWriteLock);
        new Thread(myRunnable,"Thread-1").start();
        new Thread(myRunnable, "Thread-2").start();
    }
}
