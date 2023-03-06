package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        Connection connection = null;
        String host="localhost";
        String port="5432";
        String db_name="SqlData";
        String username="postgres";
        String password="password";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+db_name+"", ""+username+"", ""+password+"");
            if (connection != null) {
                System.out.println("Connection OK");
                Statement statement=connection.createStatement();
                //statement.execute("insert into books values((nextval('books_sequence')),'The Hobbit', 'Tolkien')");
                //statement.execute("insert into books values((nextval('books_sequence')),'The mahdi', 'mhoood')");
                statement.execute("insert into books values(4,'The rami', 'znzoon')");
            }
        }
        catch (Exception PSQLException) {
            System.out.println(PSQLException.getMessage());
        }


        }

    }
