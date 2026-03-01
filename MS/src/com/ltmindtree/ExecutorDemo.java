package com.ltmindtree;

import java.util.concurrent.*;

public class ExecutorDemo {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Callable<String> task = () ->{
            Thread.sleep(1000);
            return "Done";
        };

        Future<String> future = es.submit(task);
        System.out.println("Main thread continues....");

        String result = future.get();
        System.out.println(result);
        es.shutdown();
    }
}
