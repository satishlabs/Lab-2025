package com.thread.reentrantlock;

import java.util.concurrent.locks.Lock;

public class MyRunnable4 implements Runnable{
    Lock lock;

    public MyRunnable4(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is Waiting to acquire lock");
        lock.lock();
        System.out.println();
        System.out.println(Thread.currentThread().getName()+" has acquired lock(), lockHoldCount=1");
        lock.lock();
        System.out.println(Thread.currentThread().getName()+" has acquired lock(), lockHoldCount=2");
        System.out.println(Thread.currentThread().getName()+" is about to call unlock(), lockHoldCount will become 1");
        lock.unlock();
        System.out.println(Thread.currentThread().getName()+" is about to call unlock(), loclHoldCount will become 0");
        lock.unlock();
    }
}
