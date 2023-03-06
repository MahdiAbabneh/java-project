module com.example.demo2222 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo2222 to javafx.fxml;
    exports com.example.demo2222;
}