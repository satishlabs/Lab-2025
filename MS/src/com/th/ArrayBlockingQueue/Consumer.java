package com.th.ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Consumer implements  Runnable{
    private ArrayBlockingQueue<Integer> sharedQueue;

    public Consumer(ArrayBlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        try{
            while(true){
                Integer item = sharedQueue.take();
                System.out.println("CONSUMED: "+item);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
