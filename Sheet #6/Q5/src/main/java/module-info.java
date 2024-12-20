module com.example.q5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.q5 to javafx.fxml;
    exports com.example.q5;
}