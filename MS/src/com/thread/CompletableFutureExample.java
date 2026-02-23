package com.thread;

import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

public class CompletableFutureExample {
    static void main(String[] args) {
        CompletableFuture<?>[] futures = IntStream.rangeClosed(1,10)
                .mapToObj(i ->CompletableFuture.runAsync(() ->{
                    System.out.println("Task "+i+" running on "+Thread.currentThread().getName());
                })).toArray(CompletableFuture[]::new);

        CompletableFuture.allOf(futures).join();
    }
}
