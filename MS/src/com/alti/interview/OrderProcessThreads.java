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