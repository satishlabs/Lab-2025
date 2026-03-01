package com.ltmindtree;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockSafe {
    private static final ReentrantLock lock1 = new ReentrantLock();
    private static final ReentrantLock lock2 = new ReentrantLock();

    static void main(String[] args) {
        Runnable task = () ->{
            try{
                if(lock1.tryLock(1, TimeUnit.SECONDS)){
                    try{
                        System.out.println(Thread.currentThread().getName()+" locked lock1");
                        if(lock2.tryLock(1, TimeUnit.SECONDS)){
                            try{
                                System.out.println(Thread.currentThread().getName()+" locked lock2");
                            }finally {
                                lock2.unlock();
                            }
                        }
                    }finally {
                        lock1.unlock();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        new Thread(task, "T1").start();
        new Thread(task, "T2").start();
    }
}
