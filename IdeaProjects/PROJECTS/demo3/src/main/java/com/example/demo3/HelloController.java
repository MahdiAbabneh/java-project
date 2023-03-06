package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    TextField text1;
    @FXML
    TextField text2;

    public void onhi(ActionEvent actionEvent) {
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
                //statement.execute("insert into books values(4,'The rami', 'znzoon')");


                    String query = "insert into books values( (nextval('books_sequence'))"+ ","+"'"+text1.getText()+"','"+text2.getText()+"'"+")";
                    statement.execute(query);


            }
        }
        catch (Exception PSQLException) {
            System.out.println(PSQLException.getMessage());
        }



    }
}