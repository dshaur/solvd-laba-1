package com.solvd.ta.threads_connection_pools.demo2;

// Demo 2: It creates a connection pool that uses a ConcurrentLinkedQueue<Connection> from java.util.concurrent and
// it is thread-safe and initialized.
public class ConnectionPoolMain {
    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool(5);

        try {
            Connection connection1 = connectionPool.getConnection();
            Connection connection2 = connectionPool.getConnection();

            connection1.executeQuery("SELECT * FROM users");
            connection2.executeQuery("SELECT * FROM products");

            connectionPool.returnConnection(connection1);
            connectionPool.returnConnection(connection2);

            Connection connection3 = connectionPool.getConnection();
            connection3.executeQuery("SELECT * FROM orders");

            connectionPool.returnConnection(connection3);

        } catch (ConnectionPoolException e) {
            System.out.println(e.getMessage());
        }
    }
}
