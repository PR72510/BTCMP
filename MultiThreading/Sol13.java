package com.company;

import java.util.Scanner;

import static com.company.ThreadColor.ANSI_BLUE;
import static com.company.ThreadColor.ANSI_PURPLE;

public class Sol13 {
    public static void main(String[] args)
            throws InterruptedException
    {
        final PC pc = new PC();

        // Create a thread object that calls pc.produce()
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    pc.produce();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });

        // Create another thread object that calls
        // pc.consume()
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    pc.consume();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // t1 finishes before t2
        t1.join();
        t2.join();
    }


}

class PC
{

    public void produce()throws InterruptedException
    {

        synchronized(this)
        {
            System.out.println(ANSI_PURPLE+"producer thread running");

            wait();

            System.out.println(ANSI_PURPLE+"Resumed");
        }
    }


    public void consume()throws InterruptedException
    {

        Thread.sleep(1000);
        Scanner s = new Scanner(System.in);


        synchronized(this)
        {
            System.out.println(ANSI_BLUE+"Waiting for return key.");
            s.nextLine();
            System.out.println(ANSI_BLUE+"Return key pressed");

            // notifies the produce thread that it
            // can wake up.
            notify();


            Thread.sleep(2000);
            System.out.println(ANSI_BLUE+ "End of Thread 2 ");          //this executes first and then "Resumed" of thread1 is printed...
        }
    }
}


