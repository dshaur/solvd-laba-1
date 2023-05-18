package com.solvd.ta.threads_connection_pools.demo4;

public class Connection {
    public Connection() {
    }

    public synchronized void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }
}
