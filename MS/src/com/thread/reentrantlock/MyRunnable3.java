package com.thread.reentrantlock;

import java.util.concurrent.locks.Lock;

public class MyRunnable3 implements  Runnable{
    Lock lock;
    int ticketsAvailable = 1;

    public MyRunnable3(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        System.out.println("Waiting to book ticket for : "+Thread.currentThread().getName());
        lock.lock();
        if(ticketsAvailable>0){
            System.out.println("Booking ticket for : "+Thread.currentThread().getName());
            //Let's say system takes some time in booking ticket
            //here we have taken 1 second time
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            ticketsAvailable--;
            System.out.println("Ticket BOOKED for : "+Thread.currentThread().getName());
            System.out.println("Currently ticketsAvailable  = "+ticketsAvailable);
        }else {
            System.out.println("Ticket Not BOOKED for : "+Thread.currentThread().getName());
        }
        lock.unlock();
    }
}
