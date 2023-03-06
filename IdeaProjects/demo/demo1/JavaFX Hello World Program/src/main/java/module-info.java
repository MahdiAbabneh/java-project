module com.example.javafxhelloworldprogram {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxhelloworldprogram to javafx.fxml;
    exports com.example.javafxhelloworldprogram;
}