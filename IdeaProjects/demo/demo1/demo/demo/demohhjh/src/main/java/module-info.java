module com.example.demohhjh {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demohhjh to javafx.fxml;
    exports com.example.demohhjh;
}