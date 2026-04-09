package com.deloitte;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerWithBlockingQueue {
    static void main() {
        BlockingQueue<Integer> bQueue = new ArrayBlockingQueue<Integer>(4);
        Producer p1 = new Producer(bQueue);
        Consumer c1 = new Consumer(bQueue);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(c1);

        t1.start();
        t2.start();
    }
}
