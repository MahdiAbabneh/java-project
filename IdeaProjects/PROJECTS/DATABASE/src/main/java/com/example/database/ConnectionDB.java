package com.example.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
    public static Connection connection = null;
    public static String host = "localhost";
    public static String port = "5432";
    public static String db_name = "DBNEW";
    public static String username = "postgres";
    public static String password = "password";

    static {


        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://" + host + ":" + port + "/" + db_name + "", "" + username + "", "" + password + "");
            if (connection != null) {
                System.out.println("Connection OK");
            }
        } catch (Exception PSQLException) {
            System.out.println(PSQLException.getMessage());
        }
    }
    public static Connection getConnection()
    {
        return connection;
    }



}
