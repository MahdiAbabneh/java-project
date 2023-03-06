module com.example.data2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.data2 to javafx.fxml;
    exports com.example.data2;
}