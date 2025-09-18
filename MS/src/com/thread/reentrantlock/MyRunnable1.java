package com.thread.reentrantlock;

import java.util.concurrent.locks.Lock;

public class MyRunnable1 implements  Runnable{
    Lock lock;

    public MyRunnable1(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is waiting to acquire lock ");
        if(lock.tryLock()){
            System.out.println(Thread.currentThread().getName()+" has acquired lock.");
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }else{
            System.out.println(Thread.currentThread().getName()+" didn't got lock");
        }
    }
}
