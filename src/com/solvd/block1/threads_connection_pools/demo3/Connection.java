package com.solvd.block1.threads_connection_pools.demo3;

public class Connection implements AutoCloseable {
    public Connection() {
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
    }

    @Override
    public void close() {
        // Perform any necessary cleanup operations here
        // For example, closing any open resources related to the connection
        System.out.println("Closing the connection");
    }
}

