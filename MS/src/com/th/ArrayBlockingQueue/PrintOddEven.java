package com.th.ArrayBlockingQueue;

public class PrintOddEven {
   private static final Object obj = new Object();

    static void main(String[] args) {
        Thread oddThread = new Thread(() ->{
            for(int i=0; i<10; i++){
                synchronized (obj){
                    if(i%2 == 1){
                        System.out.println("Odd "+Thread.currentThread().getName());
                        obj.notify();
                    }else{
                        try{
                            obj.wait(1000);
                        }catch (InterruptedException e){}
                    }
                }
            }
        });

        Thread evenThread = new Thread(() ->{
            for(int i=0; i<10; i++){
                synchronized (obj){
                    if(i%2 == 0){
                        System.out.println("Even "+Thread.currentThread().getName());
                        obj.notify();
                    }
                    else{
                        try{
                            obj.wait(1000);
                        }catch (InterruptedException e){}
                    }
                }
            }
        });

        oddThread.start();
        evenThread.start();
    }


}
