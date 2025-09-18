package com.thread.deadlock;

public class B implements  Runnable{
    @Override
    public void run() {
        synchronized (Object.class){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" has acquired lock on Object class and waiting to acquire lock on String class");
            synchronized (String.class){
                System.out.println(Thread.currentThread().getName()+" has acquired lock on String class");
            }
        }
        System.out.println(Thread.currentThread().getName()+" has ENDED");
    }
}
