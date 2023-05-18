package com.solvd.ta.threads_connection_pools.demo1;

public class MyRunnable implements Runnable {
    private final String MESSAGE;

    public MyRunnable(String message) {
        this.MESSAGE = message;
    }

    public void run() {
        System.out.println("Message: " + MESSAGE);
    }
}
