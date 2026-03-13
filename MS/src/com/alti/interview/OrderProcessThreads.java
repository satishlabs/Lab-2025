package com.alti.interview;

public class OrderProcessThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread t2 = new Thread(() ->
        {
            try{
                Thread.sleep(100);
            }catch(Exception e){}

            System.out.println("Payment successful");
        });
        Thread t1 = new Thread(() -> System.out.println("Track order"));
        Thread t3 = new Thread(() -> {
            try{
                Thread.sleep(200);
            }catch(Exception e){}

            System.out.println("Order placed successfully");
        });

        t2.start();
        t1.start();
        t1.join();
        t3.start();
        t3.join();
    }
}
/*
Main Thread
     │
     ├─ start t2 (sleep 100ms)
     │
     ├─ start t1
     │      │
     │      └─ Track order
     │
     ├─ wait for t1 (join)
     │
     ├─ start t3 (sleep 200ms)
     │
     ├─ t2 wakes → Payment successful
     │
     └─ t3 wakes → Order placed successfully
* */