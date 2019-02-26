package com.company;

public class Sol14 {
    public static void main(String[] args) {
        final Demo demo = new Demo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker2();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker3();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker4();
            }
        }).start();
    }
}

 class Demo {

    public void worker1() {
        synchronized (this) {
            System.out.println("Worker1 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker1 Done");
        }
    }

    public void worker2() {
        synchronized (this) {
            System.out.println("Worker 2 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 2 Done");
        }
    }

    public void worker3() {
        synchronized (this) {
            System.out.println("Worker 3 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 3 Done");
        }
    }


    public void worker4() {
        synchronized (this) {
            System.out.println("Worker 4 Started");
            notifyAll();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker 4 Done");

        }
    }
}

