package com.thread.reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BookTicketWhenOnlyTicketAvailable {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        MyRunnable3 myRunnable3 = new MyRunnable3(lock);
        new Thread(myRunnable3, "Passenger1 Thread").start();
        new Thread(myRunnable3, "Passenger2 Thread").start();
    }
}
