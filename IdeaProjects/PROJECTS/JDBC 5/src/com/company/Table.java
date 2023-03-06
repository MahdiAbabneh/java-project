package com.company;

import java.sql.SQLException;
import java.sql.Statement;

public class Table {
    String userName;
    String name;
    int age;
    String marks;

    public Table(String userName, String name, int age, String marks) {
        this.userName = userName;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public void createTable(Statement statement,String name)
    {
        try {
            statement.execute("create Table"+name);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
