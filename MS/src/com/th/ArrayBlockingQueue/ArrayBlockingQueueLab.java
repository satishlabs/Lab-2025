package com.th.ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ArrayBlockingQueueLab {
    static void main() {
        ArrayBlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue<Integer>(3);
        Producer producer = new Producer(sharedQueue);

        Consumer consumer = new Consumer(sharedQueue);

        Thread producerThread = new Thread(producer, "ProducerThread");
        Thread consumerThread = new Thread(consumer, "ConsumerThread");

        producerThread.start();
        consumerThread.start();
    }
}
