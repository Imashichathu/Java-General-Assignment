package com.mycompany.jq13;
public class MyThread extends Thread
{
    private int number;

    public MyThread(int number)
    {
        super();
        this.number = number;
        start();
    }

    public void run()
    {
        try 
        {
            System.out.println("Child thread started with number: " + number);
            Thread.sleep(500);
            System.out.println("Child thread finished with number: " + number);
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}
