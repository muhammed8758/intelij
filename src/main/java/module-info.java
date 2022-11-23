module com.example.gitpull {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitpull to javafx.fxml;
    exports com.example.gitpull;
}