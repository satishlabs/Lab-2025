package com.th.ArrayBlockingQueue;

public class PrinterTHread {
    private int flag=0;
    public void threadA() throws InterruptedException {
        for(int i=0; i<10; i++){
            synchronized (this){
                try {
                    while(flag%3 != 0){
                        wait();
                    }

                }catch (InterruptedException e){}
                System.out.print("A ");
                flag++;
                notifyAll();;
            }
        }
    }

    public void threadB() throws InterruptedException {
        for(int i=0; i<10; i++){
            synchronized (this){
                try {
                    while(flag%3 != 1){
                        wait();
                    }
                }catch (InterruptedException e){

                }
                System.out.print("B ");
                flag++;
                notifyAll();;
            }
        }
    }

    public void threadC() throws InterruptedException {
        for(int i=0; i<10; i++){
            synchronized (this){
               try {
                   while(flag%3 != 2){
                       wait();
                   }
               }catch (InterruptedException e){}
                System.out.print("C ");
                flag++;
                notifyAll();;
            }
        }

    }
}
