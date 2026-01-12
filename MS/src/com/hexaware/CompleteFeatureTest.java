package com.hexaware;

import java.util.concurrent.CompletableFuture;

public class CompleteFeatureTest {
    static void main(String[] args) {
        //Basic CompletableFuture example
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() ->{
            System.out.println("Task running in thread: "+Thread.currentThread().getName());
            return 10;
        });

        future.thenAccept(result ->
            System.out.println("Result is: "+result)
        );
        future.join();

        System.out.println("\n============================");
        CompletableFuture<Integer> future1  = CompletableFuture.supplyAsync(() ->10)
                .thenApply(x ->x*2)
                .thenApply(x ->x+5);

        System.out.println(future1.join());

        System.out.println("\n============================");
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() ->10);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() ->20);
        CompletableFuture<Integer> result = f1.thenCombine(f2, Integer::sum);
        System.out.println(result.join());

        System.out.println("\n===========================");
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() ->{
            if(true) throw new RuntimeException("Error occurred");
            return 10;
        }).exceptionally(ex ->{
            System.out.println(ex.getMessage());
            return 0;
        });

        System.out.println(future2.join());

    }
}
