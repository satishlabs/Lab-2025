package com.thread;

import java.util.concurrent.*;

public class ProductionParallelExample {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        Callable<String> task = () ->{
            Thread.sleep(1000);
            return "Done by "+Thread.currentThread().getName();
        };

        Future<String> f1 = executorService.submit(task);
        Future<String> f2 = executorService.submit(task);
        Future<String> f3 = executorService.submit(task);

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());

        executorService.shutdown();
    }
}
