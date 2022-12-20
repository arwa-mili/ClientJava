module com.example.clientserver_client {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clientserver_client to javafx.fxml;
    exports com.example.clientserver_client;
}