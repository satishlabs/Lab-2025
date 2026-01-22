package com.th;


import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadLockTest1 {
    static void main() {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        MyRunnable myRunnable = new MyRunnable(readWriteLock);
        new Thread(myRunnable, "Thread-1").start();
        new Thread(myRunnable, "Thread-2").start();
    }
}

class MyRunnable implements  Runnable{
    ReadWriteLock readWriteLock;

    public MyRunnable(ReadWriteLock readWriteLock){
        this.readWriteLock = readWriteLock;
    }
    @Override
    public void run() {
        readWriteLock.readLock().lock();
        System.out.println(Thread.currentThread().getName()+" has acquire read lock");
        try {
            Thread.sleep(10000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+" has released read lock");
        readWriteLock.readLock().unlock();

    }
}