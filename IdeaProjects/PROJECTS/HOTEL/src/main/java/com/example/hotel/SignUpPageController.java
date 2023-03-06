package com.example.hotel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import static com.example.hotel.DBConnection.getConnection;

public class SignUpPageController {

    @FXML
    public Label mass;
    @FXML
    TextField name;

    @FXML
    TextField password;

    @FXML
    Button ButtonSign;

    @FXML
    Button ButtonBack;

    @FXML
    Button ButtonRest;


    public void signUser(ActionEvent actionEvent) {
        insertUser();
        mass.setText("Successfully ...");

    }

    public void goBack(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
            Stage stage = (Stage) ButtonBack.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }

    }

    public void restField(ActionEvent actionEvent) {

        name.setText(null);
        password.setText(null);
    }

    @FXML
    private void insertUser() {
        String user="'user'";
        String query = "insert into Login values("+"'"+name.getText()+"'"+ ","+"'"+password.getText()+"'"+ ","+user+")";
        executeQuery(query);
}

    public void executeQuery(String query) {
        Connection connection = getConnection();
        Statement st;
        try {
            st = connection.createStatement();
            st.executeUpdate(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
