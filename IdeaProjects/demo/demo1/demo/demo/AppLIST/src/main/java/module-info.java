module com.example.applist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.applist to javafx.fxml;
    exports com.example.applist;
}