module com.example.lambdaexpressionsfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lambdaexpressionsfx to javafx.fxml;
    exports com.example.lambdaexpressionsfx;
}