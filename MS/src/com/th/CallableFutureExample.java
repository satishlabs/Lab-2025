package com.th;

import java.util.concurrent.*;

public class CallableFutureExample {
    static void main() throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(1);
        Callable<Integer> task = () ->{
            Thread.sleep(1000);
            return 10;
        };

        Future<Integer> future = es.submit(task);

        Integer result = future.get();
        System.out.println("Result: "+result);

        es.shutdown();

    }
}
