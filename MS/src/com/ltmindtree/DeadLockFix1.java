package com.ltmindtree;

public class DeadLockFix1 {
    private static final Object obj1 = new Object();
    private static final Object obj2 = new Object();
    static void main(String[] args) {

        Thread t1 = new Thread(() ->{
            synchronized (obj1){
                System.out.println("t1 locked obj1, waiting for obj2");
                synchronized (obj2){
                    System.out.println("t1 acquired obj2");
                }
            }
        });

        Thread t2 = new Thread(() ->{
            synchronized (obj1){
                System.out.println("t1 locked obj1, waiting for obj2");
                synchronized (obj2){
                    System.out.println("t2 acquired obj2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
