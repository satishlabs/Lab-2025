package com.ltmindtree.completable;

import java.util.concurrent.CompletableFuture;

public class Demo1 {
    static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() ->
                System.out.println("Running async"));
        future.join();

        System.out.println("\n===================");
        CompletableFuture<String> f = CompletableFuture.supplyAsync(() ->"Hello");
        System.out.println(f.join());

        System.out.println("\n===================");

        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> "Satish")
                .thenApply(name -> name.toUpperCase());
        System.out.println(f1.join());
    }
}
