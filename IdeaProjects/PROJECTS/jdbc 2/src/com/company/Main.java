package com.company;

import java.sql.*;

public class Main {

    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";



    public static void main(String[] args) throws Exception{
        Connection connection = null;

        String host="localhost";
        String port="5432";
        String db_name="newDB";
        String username="postgres";
        String password="password";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://"+host+":"+port+"/"+db_name+"", ""+username+"", ""+password+"");
            if (connection != null) {
                System.out.println("Connection OK");
            }
            Statement statement = connection.createStatement();

            statement.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            statement.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text" +
                    ")");

            insertContact(statement,"Mahdi", 6545678, "Mahdi@email.com");
            insertContact(statement,"Rami", 45632, "Rami@anywhere.com");
            insertContact(statement,"Ravi", 4829484, "Ravi@somewhere.com");
            insertContact(statement,"Rakshita", 9038, "Rakshita@email.com");
            insertContact(statement,"Zainab ", 9038, "Zainab@email.com");
            insertContact(statement,"lllllllllllllll", 6545678, "Mahdi@email.com");
            /*
            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + "=5566789" +
                    " WHERE " + COLUMN_NAME + "='Ravi'");

             */
            /*
            statement.execute("DELETE FROM " +TABLE_CONTACTS +
                    " WHERE " + COLUMN_NAME + "='Mahdi'");

             */

            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while(results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " +
                        results.getInt(COLUMN_PHONE) + " " +
                        results.getString(COLUMN_EMAIL));
            }

        } catch (Exception PSQLException) {
            System.out.println(PSQLException.getMessage());
        }
    }
    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS + " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " + COLUMN_EMAIL + " ) " +
                "VALUES('" + name + "', " + phone + ", '" + email + "')");
    }
}
