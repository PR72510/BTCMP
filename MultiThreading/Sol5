package com.company;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.company.ThreadColor.ANSI_YELLOW;

public class Sol5 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_YELLOW + "Thread 1");
            }
        });
        executorService.shutdownNow();
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());
    }
}

