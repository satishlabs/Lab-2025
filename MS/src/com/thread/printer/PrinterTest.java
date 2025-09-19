package com.thread.printer;

public class PrinterTest {
    private static final Object lock = new Object();
    private static int count=1;

    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            for(int i=0; i<5; i++){
                synchronized (lock){
                    while(count != 1){
                        try{
                            lock.wait(1000);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.print("A ");
                    count=2;
                    lock.notifyAll();
                }
            }
        });

        Thread t2 = new Thread(() ->{
            for(int i=0; i<5; i++){
                synchronized (lock){
                    while(count != 2){
                        try{
                            lock.wait(1000);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.print("B ");
                    count=3;
                    lock.notifyAll();

                }
            }
        });
        Thread t3 = new Thread(() ->{
            for(int i=0; i<5; i++){
                synchronized (lock){
                    while(count != 3){
                        try{
                            lock.wait(1000);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.print("C ");
                    count=1;
                    lock.notifyAll();
                }
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }
}
