module com.example.hi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hi to javafx.fxml;
    exports com.example.hi;
}