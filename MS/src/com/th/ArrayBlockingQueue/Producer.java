package com.th.ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer implements  Runnable{
    private final ArrayBlockingQueue<Integer> sharedQueue;

    public Producer(ArrayBlockingQueue<Integer> sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for(int i=0; i<=10; i++){
          try{
              sharedQueue.put(i);
              System.out.println("Produced: "+i);
              Thread.sleep(1000);
          }catch (InterruptedException e){
              Thread.currentThread().interrupt();
          }
        }
    }
}
