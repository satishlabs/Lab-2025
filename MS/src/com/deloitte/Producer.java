package com.deloitte;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    BlockingQueue<Integer> bQueue;

    public Producer(BlockingQueue<Integer> bQueue) {
        this.bQueue = bQueue;
    }

    @Override
    public void run() {
        for(int i=1; i<=4; i++){
            try{
                bQueue.put(i);
                System.out.println("Produced: "+i);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
