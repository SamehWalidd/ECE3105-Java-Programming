package com.example.q3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.util.Random;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();
        Random random = new Random();
        HBox h = new HBox();
        Insets insets = new Insets(20);
        h.setPadding(insets);
        h.setSpacing(10);

        Text t = new Text("java");
        t.setRotate(90);
        t.setFill(Color.color(random.nextDouble(), random.nextDouble(),random.nextDouble()));
        t.setFont(Font.font("Times New Romain", FontWeight.BOLD,FontPosture.ITALIC,22));

        Text t2 = new Text("java");
        t2.setRotate(90);
        t2.setFill(Color.color(random.nextDouble(), random.nextDouble(),random.nextDouble()));
        t2.setFont(Font.font("Times New Romain", FontWeight.BOLD,FontPosture.ITALIC,22));

        Text t3 = new Text("java");
        t3.setRotate(90);
        t3.setFont(Font.font("Times New Romain", FontWeight.BOLD,FontPosture.ITALIC,22));
        t3.setFill(Color.color(random.nextDouble(), random.nextDouble(),random.nextDouble()));

        Text t4 = new Text("java");
        t4.setRotate(90);
        t4.setFont(Font.font("Times New Romain", FontWeight.BOLD,FontPosture.ITALIC,22));
        t4.setFill(Color.color(random.nextDouble(), random.nextDouble(),random.nextDouble()));



        h.getChildren().add(t);
        h.getChildren().add(t2);
        h.getChildren().add(t3);
        h.getChildren().add(t4);

        pane.getChildren().add(h);

        Scene scene = new Scene(pane, 222, 100);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}