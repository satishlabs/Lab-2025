package com.thread.deadlock;

public class A implements Runnable{
    @Override
    public void run() {
        synchronized (String.class){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" has acquired lock on String class and waiting to acquire lock on Object class");
            synchronized (Object.class){
                System.out.println(Thread.currentThread().getName()+" has acquired lock on Object class");
            }
        }
        System.out.println(Thread.currentThread().getName()+" has ENDED");
    }
}
