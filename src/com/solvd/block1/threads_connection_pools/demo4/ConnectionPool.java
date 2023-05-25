package com.solvd.block1.threads_connection_pools.demo4;

public class ConnectionPool {
    private Connection[] connections;
    private boolean[] usedConnections;
    private int size;

    public ConnectionPool(int size) {
        this.size = size;
        this.connections = new Connection[size];
        this.usedConnections = new boolean[size];

        for (int i = 0; i < size; i++) {
            this.connections[i] = new Connection();
            this.usedConnections[i] = false;
        }
    }

    public synchronized Connection getConnection() throws ConnectionPoolException {
        for (int i = 0; i < size; i++) {
            if (!usedConnections[i]) {
                usedConnections[i] = true;
                return connections[i];
            }
        }

        throw new ConnectionPoolException("Connection pool exhausted");
    }

    public synchronized void returnConnection(Connection connection) {
        for (int i = 0; i < size; i++) {
            if (connections[i] == connection) {
                usedConnections[i] = false;
                break;
            }
        }
    }
}
