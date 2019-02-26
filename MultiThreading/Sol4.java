package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sol4 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1.1");
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000L);
                    }catch (InterruptedException e){
                        System.out.println("Thread 1.2 Interrupted!");
                    }
                    System.out.println("Thread 1.2");
                }
            });
        } finally {
            executorService.shutdown();             // will just tell the executor service that it can't accept new tasks, but the already submitted tasks continue to run
        }
        System.out.println(executorService.isShutdown());               // Returns true if this executor has been shut down.
        System.out.println(executorService.isTerminated());             // Returns true if all tasks have completed following shut down.

        System.out.println("--------------------");

        final ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        try {
            executorService1.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2.1");
                }
            });

            executorService1.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(6000L);

                    }catch (InterruptedException e){
                        System.out.println("Thread 2.2 Interrupted!");
                    }
                    System.out.println("Thread 2.2");

                }
            });
        } finally {
            executorService1.shutdownNow();         // will try to cancel the already submitted tasks by interrupting the relevant threads
        }
        System.out.println(executorService1.isShutdown());
        System.out.println(executorService1.isTerminated());

    }
}

