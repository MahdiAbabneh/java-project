package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception{
        Connection con=null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\user1\\Desktop\\database.db");
            if (con != null) {
                System.out.println("Connection OK");
            }
        } catch (Exception PSQLException) {
            System.out.println(PSQLException.getMessage());
        }
        String sql_query="create table employees(eno number,ename varchar2(10),esal numb er,eaddr varchar2(10))";
        Statement statement = con.createStatement();
        //statement.execute(sql_query);
        // System.out.println("Table Created Successfully");
        String sql_query2="insert into employees values(1,'mahdi',1000,'jordan')";
        //int updateCount=statement.executeUpdate(sql_query2);
         //System.out.println("The number of rows inserted :"+updateCount);


    }
}
