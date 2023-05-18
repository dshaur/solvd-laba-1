package com.solvd.ta.threads_connection_pools.demo3;

// Demo 3: It initializes the connection pool object of size 5, loads the connection pool using single threads,
// and 5 threads are able to get connections while 2 threads wait for the next available connection.
// This method utilizes Java Thread Pool with 7 threads in total.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConnectionPoolMain {
    public static void main(String[] args) throws InterruptedException {
        ConnectionPool connectionPool = new ConnectionPool(5);

        ExecutorService executorService = Executors.newFixedThreadPool(7);

        for (int i = 0; i < 5; i++) {
            executorService.submit(() -> {
                try {
                    Connection connection = connectionPool.getConnection();

                    connection.executeQuery("SELECT * FROM users");

                    Thread.sleep(1000);

                    connectionPool.returnConnection(connection);
                } catch (ConnectionPoolException | InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            });
        }

        for (int i = 0; i < 2; i++) {
            executorService.submit(() -> {
                try {
                    Connection connection = connectionPool.getConnection();

                    connection.executeQuery("SELECT * FROM products");

                    Thread.sleep(1000);

                    connectionPool.returnConnection(connection);
                } catch (ConnectionPoolException | InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            });
        }

        executorService.shutdown();
    }
}
