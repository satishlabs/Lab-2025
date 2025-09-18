package com.thread.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;

public class MyRunnable1 implements  Runnable{
    ReadWriteLock readWriteLock;

    public MyRunnable1(ReadWriteLock readWriteLock) {
        this.readWriteLock = readWriteLock;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is Waiting to acquire lock");
        readWriteLock.writeLock().lock();
        System.out.println(Thread.currentThread().getName()+" has acquired write lock.");
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" has released write lock");
        readWriteLock.writeLock().unlock();
    }
}
