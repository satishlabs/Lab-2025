package com.thread.deadlock;

public class AA implements  Runnable{
    @Override
    public void run() {
        synchronized (String.class){
            System.out.println(Thread.currentThread().getName()+" has acquired lock on String class and Waiting to acquire lock on Object class");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            synchronized (Object.class){
                System.out.println(Thread.currentThread().getName()+" has acquired lock on Object class");
            }
        }
        System.out.println(Thread.currentThread().getName()+" has ENDED");
    }
}
