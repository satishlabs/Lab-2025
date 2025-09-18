package com.thread.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WriteLockTest {
    public static void main(String[] args) {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        MyRunnable1 myRunnable1 = new MyRunnable1(readWriteLock);
        new Thread(myRunnable1, "Thread-1").start();
        new Thread(myRunnable1, "Thread-2").start();
    }
}
