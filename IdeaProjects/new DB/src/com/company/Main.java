package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\user1\\Desktop\\employee.db");
            Statement statement = con.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS employee"+"(employee_id INTEGER ,name TEXT,gender TEXT,bird_day TEXT");
            statement.execute("CREATE TABLE IF NOT EXISTS money"+ "(id INTEGER,salary INTEGER, bonus INTEGER)");
            statement.execute("INSERT INTO employee VALUES(1,'mahdi','male','6/12')");
            statement.close();
            con.close();
        }
        catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }}
