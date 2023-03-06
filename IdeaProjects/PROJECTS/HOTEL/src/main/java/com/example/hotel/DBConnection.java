package com.example.hotel;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection connection = null;


    public static Connection getConnection() {
        return connection;
    }

    static {
        try {
            Class.forName("org.sqlite.JDBC");
            connection= DriverManager.getConnection("jdbc:sqlite:C:\\Users\\user1\\Desktop\\hotel.db");
            System.out.println("Connection OK");
        } catch (Exception PSQLException) {
            System.out.println(PSQLException.getMessage());
        }

    }

}
