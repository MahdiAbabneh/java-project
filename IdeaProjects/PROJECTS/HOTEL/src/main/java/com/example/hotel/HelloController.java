package com.example.hotel;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        DBConnection.getConnection();
    }
}