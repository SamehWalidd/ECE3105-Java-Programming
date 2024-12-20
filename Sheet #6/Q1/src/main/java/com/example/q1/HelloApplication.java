package com.example.q1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridPane = new GridPane();


        Image flag = new Image("D://AAST//Term 5//Java Programming//ECE3105 Java Programming//Sheet #6//Q1//img//flag.jpeg");

        ImageView flagview = new ImageView(flag);
        flagview.setFitHeight(100);flagview.setFitWidth(150);
        ImageView flagview2 = new ImageView(flag);
        flagview2.setFitHeight(100);flagview2.setFitWidth(150);
        ImageView flagview3 = new ImageView(flag);
        flagview3.setFitHeight(100);flagview3.setFitWidth(150);
        ImageView flagview4 = new ImageView(flag);
        flagview4.setFitHeight(100);flagview4.setFitWidth(150);

        gridPane.add(flagview,1,1);
        gridPane.add(flagview2,2,1);
        gridPane.add(flagview4,1,2);
        gridPane.add(flagview3,2,2);


        Scene scene = new Scene(gridPane, 300, 200);
        stage.setTitle("barcelona");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}