package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelTasksExample {
    public static void main(String[] args) {
        // Thread pool with 4 parallel threads
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Submit multiple tasks
        for (int i = 1; i <= 10; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId +
                        " running on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000); // simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        executor.shutdown();
    }
}
