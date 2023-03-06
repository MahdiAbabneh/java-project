module com.example.setupsampletodolistapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.setupsampletodolistapplication to javafx.fxml;
    exports com.example.setupsampletodolistapplication;
    exports datamodel;
    opens datamodel to javafx.fxml;
    exports com.example.setupsampletodolistapplication.datamodel;
    opens com.example.setupsampletodolistapplication.datamodel to javafx.fxml;
}