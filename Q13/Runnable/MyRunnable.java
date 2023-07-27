package com.mycompany.jq13ii;
public class MyRunnable implements Runnable
{
    public void run() 
    {
        try
        {
            for (int i = 1; i <= 10; i++)
            {
                System.out.println(i);
                Thread.sleep(500);
            }
        } 
        catch (InterruptedException e)
        {
            System.out.println("Child thread interrupted.");
        }
    }
}
