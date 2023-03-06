module com.example.data {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.data to javafx.fxml;
    exports com.example.data;
}