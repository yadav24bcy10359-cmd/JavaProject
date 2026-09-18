package airlinemanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//Uses a single method to get a connection.
//Replace DB constants with environment variables for production.

public class DBConnection {
    // DB config: change these to your values or load from env
    private static final String DB_URL = "jdbc:mysql://localhost:3306/airline";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    static {
        try {
            // modern driver class is optional with recent JDBC; keep for compatibility
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL driver not found. " + e.getMessage());
        }
    }

    //Get a new DB connection. Caller should close it.
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }
}

