package com.alti.interview;

public class PrintABCUsingThread {
    private static final Object obj = new Object();
    static int count=1;
    static void main(String[] args) {
        Thread t1 = new Thread(() ->{
         for(int i=1; i<=5; i++){
             synchronized (obj){
                while(count != 1){
                    try{
                        obj.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                 System.out.println(Thread.currentThread().getName()+" A ");
                 count=2;
                 obj.notifyAll();
             }
         }
        });
        Thread t2 = new Thread(() ->{
           for(int i=1; i<=5; i++){
               synchronized (obj){
                  while(count != 2){
                      try{
                          obj.wait();
                      } catch (InterruptedException e) {
                          throw new RuntimeException(e);
                      }
                  }
                   System.out.println(Thread.currentThread().getName()+" B ");
                  count=3;
                   obj.notifyAll();
               }
           }
        });

        Thread t3 = new Thread(() ->{
            for(int i=1; i<=5; i++){
                synchronized (obj){

                   while(count != 3){
                       try{
                           obj.wait();
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                   }
                    System.out.println(Thread.currentThread().getName()+" C ");
                   count=1;
                   obj.notifyAll();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
