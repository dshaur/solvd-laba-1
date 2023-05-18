package com.solvd.ta.threads_connection_pools.demo2;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConnectionPool {
    private ConcurrentLinkedQueue<Connection> connectionQueue;
    private int maxSize;

    public ConnectionPool(int maxSize) {
        this.connectionQueue = new ConcurrentLinkedQueue<>();
        this.maxSize = maxSize;

        for (int i = 0; i < maxSize; i++) {
            this.connectionQueue.add(new Connection());
        }
    }

    public Connection getConnection() throws ConnectionPoolException {
        Connection connection = this.connectionQueue.poll();

        if (connection == null) {
            throw new ConnectionPoolException("Connection pool exhausted");
        }

        return connection;
    }

    public void returnConnection(Connection connection) {
        this.connectionQueue.add(connection);
    }
}
