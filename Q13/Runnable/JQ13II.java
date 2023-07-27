package com.mycompany.jq13ii;
public class JQ13II
{
    public static void main(String[] args)
    {
        MyRunnable r1= new MyRunnable();
        MyRunnable r2= new MyRunnable();

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        thread1.start();
        thread2.start();

    }
}
