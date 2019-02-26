package com.company;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sol6 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> integerFuture = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });

        executorService.shutdown();

        if (integerFuture.isDone()) {                       // Returns true if this task completed.
            try {
                System.out.println(integerFuture.get());    // Waits if necessary for the computation to complete, and then retrieves its result.
            }catch (Exception e){
                System.out.println("Future Interrupted!");
            }
        }

       else if(integerFuture.isCancelled()){                    // Returns true if this task was cancelled before it completed normally.
            System.out.println("Your task has been cancelled");
        }
    }

}

