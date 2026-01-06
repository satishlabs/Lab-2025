package com.epam;

import java.util.LinkedList;
import java.util.List;

public class Producer implements  Runnable{
    public List<Integer> list;
    Producer(){
        list = new LinkedList<>();
    }

    @Override
    public void run() {
        synchronized (this){
            for(int i=1; i<=5; i++){
                list.add(i);
                System.out.println("Producer is still Producing, Product : "+i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("Production is over, consumer can consume.");
            //Production is over, notify consumer thread so that consumer can consume.
            this.notify();
        }
    }
}
