package com.example.q4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        TextField textField = new TextField();
        Button UCB = new Button("Upper Case");
        Button LCB = new Button("Lower Case");

        UCB.setOnAction(e -> {
            textField.setText(textField.getText().toUpperCase())
        });
        LCB.setOnAction(e -> textField.setText(textField.getText().toLowerCase()));

        HBox hbox = new HBox(10, textField, UCB, LCB);

        Scene scene = new Scene(hbox, 400, 100);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}