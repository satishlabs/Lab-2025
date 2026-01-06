package com.epam;

import java.util.LinkedList;
import java.util.List;

public class Consumer extends Thread{
    Producer prod;

    Consumer(Producer obj){
        prod = obj;
    }
    @Override
    public void run() {
        synchronized (this.prod){
            System.out.println("Consumer waiting for production to get over.");
            try{
                this.prod.wait();
            }catch(InterruptedException e){e.printStackTrace();}
        }
        /*production is over, consumer will start consuming.*/
        int productSize= this.prod.list.size();
        for(int i=0;i<productSize;i++)
            System.out.println("CONSUMED : "+ this.prod.list.remove(0) +" ");

    }
}
