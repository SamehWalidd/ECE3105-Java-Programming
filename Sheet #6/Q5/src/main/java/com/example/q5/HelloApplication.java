package com.example.q5;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        HBox h = new HBox();
        h.setSpacing(10);
        h.setAlignment(Pos.BOTTOM_CENTER);
        String[] labels = {"Projects--20%", "Quizzes--10%", "Midterm Exams--30%", "Final Exam--40%"};
        int[] perc = {20, 10, 30, 40};
        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};

        for(int i=0;i<4;i++)
        {
            Rectangle bar= new Rectangle(50,perc[i]*2);
            bar.setFill(colors[i]);

            Text t = new Text(labels[i]);

            VBox BwL = new VBox();
            BwL.setAlignment(Pos.BOTTOM_CENTER);
            BwL.setSpacing(5);
            BwL.getChildren().addAll(t,bar);

            h.getChildren().add(BwL);

        }

        Scene scene = new Scene(h, 400, 150);
        stage.setTitle("Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}