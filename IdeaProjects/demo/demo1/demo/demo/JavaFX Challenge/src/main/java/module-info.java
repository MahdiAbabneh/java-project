module com.example.javafxchallenge {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxchallenge to javafx.fxml;
    exports com.example.javafxchallenge;
}