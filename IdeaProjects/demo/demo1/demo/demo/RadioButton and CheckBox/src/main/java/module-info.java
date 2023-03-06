module com.example.radiobuttonandcheckbox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.radiobuttonandcheckbox to javafx.fxml;
    exports com.example.radiobuttonandcheckbox;
}