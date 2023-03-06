package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        Connection connection=null;
        try
        {
            connection= DriverManager.getConnection("jdbc:sqlite:C:\\Users\\user1\\Desktop\\mahdi123321.db");
            if (connection!=null)
            {
                System.out.println("connection is ok");
            }
            Statement statement=connection.createStatement();
           // statement.execute("create table mahdii(id INTEGER primary key autoincrement, name varchar,age int)");
            statement.execute("CREATE TABLE departments  \n" + "( department_id INTEGER PRIMARY KEY AUTOINCREMENT,  \n" + "department_name VARCHAR  \n" +
                    ");  ");
            statement.execute("CREATE TABLE employees  \n" +
                    "(employee_id INTEGER PRIMARY KEY AUTOINCREMENT,  \n" +
                    "last_name VARCHAR NOT NULL,  \n" +
                    "first_name VARCHAR,  \n" +
                    "department_id INTEGER,  \n" +
                    "CONSTRAINT fk_departments  \n" +
                    "FOREIGN KEY (department_id)  \n" +
                    "REFERENCES departments(department_id)  \n" +
                    ");  ");
            ResultSet resultSet=statement.executeQuery("select* from employees");
            while (resultSet.next())
            {
                System.out.println(resultSet.getInt(1));
            }


        }catch (Exception SQLException)
        {
            System.out.println(SQLException.getMessage());
        }
    }
}
