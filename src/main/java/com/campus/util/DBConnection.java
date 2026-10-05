package com.campus.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static final String DB_URL = "jdbc:mysql://localhost:3306/campus_db";

    public static final String DB_USER = "root";

    public static final String DB_PASSWORD = "2311";

    public static Connection getConnection() {

        try {
            Connection conn = DriverManager.getConnection(
                    DB_URL,
                    DB_USER,
                    DB_PASSWORD
            );

            System.out.println("Database connection established successfully");

            return conn;

        } catch (SQLException e) {

            System.out.println("Failed to establish database connection");
            e.printStackTrace();

            return null;
        }
    }
}