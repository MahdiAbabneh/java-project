package com.example.hotel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.*;



public class LoginPageController {

    public Button exit;
    @FXML
     TextField username;

    @FXML
      TextField password;

    @FXML
     Button loginButton;

    @FXML
     ComboBox<String> comp;

    @FXML
    Button signButton;


    @FXML
    public void onButtonClicked(ActionEvent e) throws Exception{
      login();

    }


    public void login(){

        String Username = username.getText();
        String Password = password.getText();
        String type = (String) comp.getValue();

        PreparedStatement preparedStatement = null;
        ResultSet resultSet= null;

        String sql = "SELECT * FROM Login WHERE username = ? AND password = ? AND type = ? ";

        try{
            preparedStatement = DBConnection.getConnection().prepareStatement(sql);

            preparedStatement.setString(1, Username);
            preparedStatement.setString(2, Password);
            preparedStatement.setString(3, type);
            resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                if (type.equals("admin")){

                    try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("admin.fxml"));
                        Stage stage = (Stage) loginButton.getScene().getWindow();
                        Scene scene = new Scene(loader.load());
                        stage.setScene(scene);
                    }catch (IOException io){
                        io.printStackTrace();
                    }

                }else if (type.equals("user")){

                    try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("user.fxml"));
                        Stage stage = (Stage) loginButton.getScene().getWindow();
                        Scene scene = new Scene(loader.load());
                        stage.setScene(scene);
                    }catch (IOException io){
                        io.printStackTrace();
                    }

                }

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }


    public void gotosignPage(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUpPage.fxml"));
            Stage stage = (Stage) signButton.getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }    }

    public void exit(ActionEvent actionEvent) {
        System.exit(1);
    }
}