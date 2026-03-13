package com.alti.interview;

public class PrintThreadAThreadB {
    private static final  Object obj = new Object();
    static int n=10;
    static void main() {
        Thread oddThread = new Thread(() ->{
            synchronized (obj){
                for(int i=1; i<=n; i++){
                    if(i%2!=0){
                        System.out.println("oddTread: "+i);
                    }else{
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                        }
                    }
                    obj.notifyAll();
                }
            }
        });

        Thread evenThread = new Thread(() ->{
            synchronized (obj){
                for(int i=1; i<=n; i++){
                    if(i%2==0){
                        System.out.println("evenTread: "+i);
                    }else{
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                        }
                    }
                    obj.notifyAll();
                }
            }
        });

        oddThread.start();
        evenThread.start();
    }
}
