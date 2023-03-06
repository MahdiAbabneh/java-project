module com.example.csswithjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csswithjavafx to javafx.fxml;
    exports com.example.csswithjavafx;
}