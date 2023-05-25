package com.solvd.block1.threads_connection_pools.demo2;

// Demo 2: It creates a connection pool that uses a ConcurrentLinkedQueue<Connection> from java.util.concurrent and
// it is thread-safe and initialized.
public class ConnectionPoolMain {
    public static void main(String[] args) {
        ConnectionPool connectionPool = new ConnectionPool(5);

        try {
            Connection connection1 = connectionPool.getConnection();
            Connection connection2 = connectionPool.getConnection();

            try {
                connection1.executeQuery("SELECT * FROM users");
                connection2.executeQuery("SELECT * FROM products");
            } finally {
                connection1.close();
                connection2.close();
            }

            Connection connection3 = connectionPool.getConnection();
            try {
                connection3.executeQuery("SELECT * FROM orders");
            } finally {
                connection3.close();
            }

        } catch (ConnectionPoolException e) {
            System.out.println(e.getMessage());
        }

    }
}
