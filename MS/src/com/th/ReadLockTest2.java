package com.th;


import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadLockTest2 {
    static void main() {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        MyRunnable1 myRunnable1 = new MyRunnable1(readWriteLock);

        new Thread(myRunnable1, "Thread-1").start();
        new Thread(myRunnable1, "Thread-2").start();
    }
}

class MyRunnable1 implements  Runnable{
    ReadWriteLock readWriteLock;

    public MyRunnable1(ReadWriteLock readWriteLock){
        this.readWriteLock = readWriteLock;
    }

    @Override
    public void run() {
        readWriteLock.writeLock().lock();
        System.out.println(Thread.currentThread().getName()+" has acquired write lock");

        try {
            Thread.sleep(5000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" has released write lock");
        readWriteLock.writeLock().unlock();
    }
}
