package com.deloitte;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    BlockingQueue<Integer> bQueue;
    int token=-1;
    public Consumer(BlockingQueue<Integer> bQueue) {
        this.bQueue = bQueue;
    }

    @Override
    public void run() {
        while (token != 4){
            try {
                token = bQueue.take();
                System.out.println("Consumed: "+token);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
