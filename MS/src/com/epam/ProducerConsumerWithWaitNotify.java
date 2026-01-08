package com.epam;

public class ProducerConsumerWithWaitNotify {
    static void main() throws InterruptedException {
        Producer prod = new Producer();
        Consumer cons = new Consumer(prod);

        Thread producerThread = new Thread(prod, "producerThread");
        Thread consumerThread = new Thread(cons, "consumerThread");
        producerThread.start();
        Thread.sleep(100);
        consumerThread.start();
    }
}
