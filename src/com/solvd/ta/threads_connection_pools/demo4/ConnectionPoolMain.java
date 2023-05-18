package com.solvd.ta.threads_connection_pools.demo4;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConnectionPoolMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ConnectionPool connectionPool = new ConnectionPool(5);

        ExecutorService executorService = Executors.newFixedThreadPool(7);

        CompletableFuture<Void> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Connection connection = connectionPool.getConnection();

                connection.executeQuery("SELECT * FROM users");

                Thread.sleep(1000);

                connectionPool.returnConnection(connection);
            } catch (ConnectionPoolException | InterruptedException e) {
                System.out.println(e.getMessage());
            }

            return null;
        }, executorService).thenAccept(aVoid -> {
            System.out.println("Query executed by thread 1");
        });

        CompletableFuture<Void> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Connection connection = connectionPool.getConnection();

                connection.executeQuery("SELECT * FROM products");

                Thread.sleep(1000);

                connectionPool.returnConnection(connection);
            } catch (ConnectionPoolException | InterruptedException e) {
                System.out.println(e.getMessage());
            }

            return null;
        }, executorService).thenAccept(aVoid -> {
            System.out.println("Query executed by thread 2");
        });

        CompletableFuture.allOf(future1, future2).get();

        executorService.shutdown();
    }
}
