package com.example.q3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();

        pane.setOnMouseMoved(e->{
            String s = String.valueOf(e.getX());
            String s2 = String.valueOf(e.getY());

            stage.setTitle(s+","+s2);
        });

        Scene scene = new Scene(pane, 320, 240);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}