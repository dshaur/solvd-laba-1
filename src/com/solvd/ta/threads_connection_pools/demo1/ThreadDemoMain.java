package com.solvd.ta.threads_connection_pools.demo1;

//  Demo 1: It creates two threads using  Runnable  and  Thread  and runs them.

public class ThreadDemoMain {
    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable("Hello");
        MyRunnable runnable2 = new MyRunnable("World");

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }
}
