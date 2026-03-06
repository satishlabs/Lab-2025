package com.ltmindtree;

public class PrintOddEven {
    private static final Object obj = new Object();
    void main() {
        int n=9;
        Thread oddThread = new Thread(() -> {
            synchronized (obj){
                for(int i=0; i<n; i++){
                    if(i%2!=0){
                        System.out.println("Odd: "+i);
                        obj.notify();
                    }else{
                        try{
                            obj.wait();
                        }catch (InterruptedException ex){}
                    }
                }
        }
        });
        Thread evenThread = new Thread(() -> {
            synchronized (obj){
                for(int i=0; i<n; i++){
                    if(i%2==0){
                        System.out.println("Even: "+i);
                        obj.notify();
                    }else{
                        try{
                            obj.wait();
                        }catch (InterruptedException ex){}
                    }
                }
            }
        });

        oddThread.start();
        evenThread.start();
    }
}
